import com.cronoss.portfolio.tracker.account.domain.Account;
import com.cronoss.portfolio.tracker.account.domain.Asset;
import com.cronoss.portfolio.tracker.account.repository.AccountRepository;
import com.cronoss.portfolio.tracker.account.service.AccountService;
import com.cronoss.portfolio.tracker.account.service.AccountServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link AccountServiceImpl}
 */
public class AccountServiceTest {

    @Mock
    AccountRepository repository;

    Map<String, Account> data = new HashMap();

    // Object under test
    private AccountService accountService;

    @BeforeEach
    public void setUp(){

        accountService = new AccountServiceImpl(repository);

    }

    @Test
    public void testCreateAccount(){
        // Setup
        String username = "user1";
        String email = "user@email.com";

        // Execute
        Account result = this.accountService.createAccount(username, email);

        // Verify
        assertEquals(username, result.getUsername());
        assertEquals(email, result.getEmailAddress());
        assertTrue(result.getAssetList().isEmpty());
        assertNotNull(result.getLastSeen());
    }

    @Test
    public void testFindByUsername(){

    }

    @Test
    public void testFindByUsername_negative(){

    }

    @Test
    public void testAddAsset(){

    }

    @Test
    public void testAddAsset_override(){

    }

}
