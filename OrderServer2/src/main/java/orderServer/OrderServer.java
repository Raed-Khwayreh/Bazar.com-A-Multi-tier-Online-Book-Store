package orderServer;

import static spark.Spark.*;

public class OrderServer {
	public static void main(String[] args) {
		port(8888);
		get("/purchase/:id", (request, response) -> {
			response.redirect("http://172.19.2.183:6666/infoToPurchase/"+request.params(":id"));
			return null;
		});
	}

}
