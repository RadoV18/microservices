package ucb.arqsoft.mscustomer.dto

import feign.form.FormProperty

class FormDto constructor(
  val grantType2 : String,
  val clientId2 : String,
  val secret2 : String
) {
    @FormProperty("grant_type")
    var grantType = grantType2

    @FormProperty("client_id")
    var clientId = clientId2

    @FormProperty("client_ secret")
    var secret = secret2
}