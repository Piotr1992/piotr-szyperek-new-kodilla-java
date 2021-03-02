package com.crud.tasks.trello.client;

import com.crud.tasks.trello.config.TrelloConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

@ExtendWith(MockitoExtension.class)
class TrelloClientTest {

    @InjectMocks
    private TrelloClient trelloClient;

    @Mock
    private RestTemplate restTemplate;

    @Mock
    private TrelloConfig trelloConfig;

    @Test
    public void shouldCreateCard() throws URISyntaxException {
/*        // Given
        when(trelloConfig.getTrelloApiEndpoint()).thenReturn("http://test.com");
        when(trelloConfig.getTrelloAppKey()).thenReturn("test");
        when(trelloConfig.getTrelloToken()).thenReturn("test");
        TrelloCardDto trelloCardDto = new TrelloCardDto(
                "Test task",
                "Test Description",
                "top",
                "test_id"
        );
        URI uri = new URI("http://test.com/cards?key=test&token=test&name=Test%20task&desc=Test%20Description&pos=top&idList=test_id");

        CreatedTrelloCard createdTrelloCard = new CreatedTrelloCard(
                "1",
                "test task",
                "http://test.com"
        );

        when(restTemplate.postForObject(uri, null, CreatedTrelloCard.class)).thenReturn(createdTrelloCard);
        // When
        List<CreatedTrelloCard> newCard = trelloClient.createNewCard(trelloCardDto);

//        assertEquals("1", newCard.getId());
//        assertEquals("test task", newCard.getName());
//        assertEquals("http://test.com", newCard.getShortUrl());

        // Then
        assertEquals(0, newCard.get(0).getId());
        assertEquals("test task", newCard.get(0).getName());
        assertEquals("http://test.com", newCard.get(0).getShortUrl());                      */
    }

/*    @Test
    public void shouldReturnEmptyList() throws URISyntaxException {
        //Given
        when(trelloConfig.getTrelloApiEndpoint()).thenReturn("http://test.com");
        when(trelloConfig.getTrelloAppKey()).thenReturn("test");
        when(trelloConfig.getTrelloToken()).thenReturn("test");
        TrelloCardDto trelloCardDto = new TrelloCardDto(
                "Test Name",
                "Test Description",
                "top",
                "test_id"
        );
        TrelloCardDto[] trelloCards = new TrelloCardDto[0];
        URI uri = new URI("http://test.com/cards?key=test&token=test&name=Test%20Name&desc=Test%20Description&pos=top&idList=test_id");
        when(restTemplate.getForObject(uri, TrelloCardDto[].class)).thenReturn(trelloCards);
        //When
        List<CreatedTrelloCard> newCard = trelloClient.createNewCard(trelloCardDto);
        //Then
        assertNotNull(newCard);
        assertEquals(0, newCard.size());
    }                   */

}