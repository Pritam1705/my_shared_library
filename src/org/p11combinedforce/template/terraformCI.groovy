
import org.p11combinedforce.terraformCI.*
import org.p11combinedforce.common.*

def call(String url, String branch, String creds, String Dir = "") {
    
    def wsClean = new WsClean()
    def gitCheckOut = new GitCheckOut()
    def terraformInit = new TerraformInit()

    // call method with correct arg

    wsClean().call()
    gitCheckOut(url, branch, creds).call()
    terraformInit(Dir).call()
}
