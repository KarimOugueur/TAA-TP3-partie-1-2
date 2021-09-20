package tp3.partie1;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;


@SpringBootTest
@AutoConfigureMockMvc
class Partie1ApplicationTests {


/*	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private AccountRepository accountRepository;
	@BeforeEach
	void init() throws Exception {

		Product item = new Item();
		item.setTitle("article 1");
		item.setAvailable(true);
		item.setPrice(10);
		item.setBarcode("123456789");
		itemRepository.save(item);


		Account account = new Account();
		account.setNumber(120);
		account.setSolde(1500);
		accountRepository.save(account);

	/*	Client client = new Client();
		client.setAccount(account);
		client.setName("Karim");
		clientRepository.save(client); 
	}*/


	@Test
	void contextLoads()  throws Exception{
	/*	mockMvc.perform(get("/personnes/api_key=aaa"))
				.andExpect(status().isOk()).andExpect(jsonPath("$[0].nom", is("votre Nom"))); */
	}




}
