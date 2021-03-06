package br.com.prolife.rest;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.prolife.dto.MatchDTO;
import br.com.prolife.service.DonationService;

@Path("/match") 
@Produces(MediaType.APPLICATION_JSON)
public class MatchEndpoint extends AbstractEndpoint{

	@Inject
	private DonationService donationService;
	
	@GET
	@Path("/{userId}")
	public Response getMyMatchs(@PathParam("userId") Long userId, @QueryParam("lastMatchId") Long lastMatchId) throws IOException{
		try{
			
			List<MatchDTO> matchs = donationService.findMatches(userId, lastMatchId);
			
			return getSucessResponse(matchs);
			
		} catch(Exception e){
			e.printStackTrace();
			return getErrorResponse(e.getMessage());
		}
	}
}
