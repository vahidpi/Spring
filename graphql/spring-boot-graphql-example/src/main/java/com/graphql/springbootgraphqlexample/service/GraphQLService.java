package com.graphql.springbootgraphqlexample.service;


import com.graphql.springbootgraphqlexample.model.Book;
import com.graphql.springbootgraphqlexample.repository.BookRepository;
import com.graphql.springbootgraphqlexample.service.datafetcher.AllBooksDataFetcher;
import com.graphql.springbootgraphqlexample.service.datafetcher.BookDataFetcher;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;


@Service
public class GraphQLService {

    @Autowired
    BookRepository bookRepository;

    @Value("classpath:books.graphql")
    Resource resource;

    private GraphQL graphQL;

    @Autowired
    private AllBooksDataFetcher allBooksDataFetcher;

    @Autowired
    private BookDataFetcher bookDataFetcher;

    // load schema at application start up
    @PostConstruct
    private void loadSchema() throws IOException {

        //Load Books into the Book Repository
        loadDataIntoHSQL();

        // get the schema
        File schemaFile = resource.getFile();
        // parse schema
        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWiring();
        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeRegistry, wiring);
        graphQL = GraphQL.newGraphQL(schema).build();

    }

    private void loadDataIntoHSQL() {
        Stream.of(
                new Book("123", "Book111","Pub111",new String[] {"Auth111_1"}, "Nov 2017"),
                new Book("124", "Book222","Pub222",new String[] {"Auth222_1","Auth222_2"}, "Dec 2018"),
                new Book("125", "Book333","Pub333",new String[] {"Auth333_1"}, "Jun 2019"),
                new Book("126", "Book444","Pub444",new String[] {"Auth444_1","Auth444_2"}, "Jul 2011")
        ).forEach(book -> {
            bookRepository.save(book);
        });
    }

    private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("Query",typeWiring -> typeWiring
                            .dataFetcher("allBooks", allBooksDataFetcher)
                            .dataFetcher("book",bookDataFetcher))
                .build();
    }

    public GraphQL getGraphQL(){
        return graphQL;
    }

}
