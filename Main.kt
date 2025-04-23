//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val bubalsauro = mapOf(
        "GRAMA" to  listOf ("AGUA", "TERRA", "PEDRA"),// a minha é uma string
        "VENENO" to  listOf ("FADA", "GRAMA"),// o meu valor é uma lista de string
    //chave to valor
    )
    val Ivyssauro = mapOf(
        "GRAMA" to  listOf ("AGUA", "TERRA", "PEDRA"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val venusaur = mapOf(
        "GRAMA" to  listOf ("AGUA", "TERRA", "PEDRA"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val charmander = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val charmeleon = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val charizard = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val squirtle = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val wartortle = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val blastoise = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val caterpie = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO")
    )
    val metapod = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO")
    )
    val butterfree = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val weedle = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "VENENO" to  listOf ("FADA", "PLANTA")
    )
    val kakuna = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val beedrill = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val pidgey = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val pidgeotto = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val pidgeot = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val rattata = mapOf(
        "NORMAL" to listOf("")
    )
    val raticate = mapOf(
        "NORMAL" to listOf("")
    )
    val spearow = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val fearow = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("LUTADO0R", "INSETO", "GRAMA")
    )
    val ekans = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val arbok = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val pikachu = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA")
    )
    val raichu = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA")
    )
    val sandshrew = mapOf(
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val sandslash = mapOf(
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val nidoranFemea = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val nidorina = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val nidoqueen = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val nidoranMacho = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
    )
    val nidorino = mapOf(
        "VENENO" to  listOf ("VENENO", "GRAMA")
    )
    val nidoking = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val clefairy = mapOf(
        "FADA" to listOf("LUTADOR", "DRAGÃO", "SOMBRIO")
        )
    val clefable = mapOf(
        "FADA" to listOf("LUTADOR", "DRAGÃO", "SOMBRIO")
    )
    val vulpix = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val ninetales = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val jigglypuff = mapOf(
        "NORMAL" to listOf(""),
        "FADA" to listOf("LUTADOR", "DRAGÃO", "SOMBRIO")
    )
    val wigglytuff = mapOf(
        "NORMAL" to listOf(""),
        "FADA" to listOf("LUTADOR", "DRAGÃO", "SOMBRIO")
    )
    val zubat = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "VOADOR" to listOf("LUTADO0R", "INSETO", "GRAMA")
    )
    val golbat = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "VOADOR" to listOf("LUTADO0R", "INSETO", "GRAMA")
    )
    val oddish = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val gloom = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val vileplume = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val paras = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val parasect = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val venonat = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val venomoth = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val diglett = mapOf(
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val dugtrio = mapOf(
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val meowth = mapOf(
        "NORMAL" to listOf("")
    )
    val persian = mapOf(
        "NORMAL" to listOf("")
    )
    val psyduck = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val golduck = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val mankey = mapOf(
        "LUTADOR" to listOf("NORMAL","PEDRA","METAL","GELO","SOMBRIO")
    )
    val primeape = mapOf(
        "LUTADOR" to listOf("NORMAL","PEDRA","METAL","GELO","SOMBRIO")
    )
    val growlithe = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val arcanine = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val poliwag = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val poliwhirl = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val poliwrath = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "LUTADOR" to listOf("NORMAL","PEDRA","METAL","GELO","SOMBRIO")
    )
    val abra = mapOf(
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val kadabra = mapOf(
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val alakazam = mapOf(
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val machop = mapOf(
        "LUTADOR" to listOf("NORMAL","PEDRA","METAL","GELO","SOMBRIO")
    )
    val machoke = mapOf(
        "LUTADOR" to listOf("NORMAL","PEDRA","METAL","GELO","SOMBRIO")
    )
    val machamp = mapOf(
        "LUTADOR" to listOf("NORMAL","PEDRA","METAL","GELO","SOMBRIO")
    )
    val bellsprout = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val weepinbell = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val victreebel = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val tentacool = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val tentacruel = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val geodude = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val graveler = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val golem = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val ponyta = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val rapidash = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val slowpoke = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val slowbro = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val magnemite = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA"),
        "METAL" to listOf("PEDRA","GELO","FADA")
    )
    val magneton = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA"),
        "METAL" to listOf("PEDRA","GELO","FADA")
    )
    val farfetchd = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val doduo = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val dodrio = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val seel = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val dewgong = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "GELO" to listOf("TERRA","VOADOR","GRAMA","DRAGAO")
    )
    val grimer = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val muk = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val shellder = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val cloyster = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "GELO" to listOf("TERRA","VOADOR","GRAMA","DRAGAO")
    )
    val gastly = mapOf(
        "FANTASMA" to listOf("FANTASMA","PSIQUICO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val haunter = mapOf(
        "FANTASMA" to listOf("FANTASMA","PSIQUICO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val gengar = mapOf(
        "FANTASMA" to listOf("FANTASMA","PSIQUICO"),
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val onix = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val drowzee = mapOf(
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val hypno = mapOf(
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val krabby = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val kingler = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val voltorb = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA")
    )
    val electrode = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA")
    )
    val exeggcute = mapOf(
        "GRAMA" to  listOf ("AGUA", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val exeggutor = mapOf(
        "GRAMA" to  listOf ("AGUA", "TERRA", "PEDRA"),
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val cubone = mapOf(
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val marowak = mapOf(
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val hitmonlee = mapOf(
        "LUTADOR" to listOf("NORMAL","PEDRA","METAL","GELO","SOMBRIO")
    )
    val hitmonchan = mapOf(
        "LUTADOR" to listOf("NORMAL","PEDRA","METAL","GELO","SOMBRIO")
    )
    val lickitung = mapOf(
        "NORMAL" to listOf("")
    )
    val koffing = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val weezing = mapOf(
        "VENENO" to  listOf ("FADA", "GRAMA")
    )
    val rhyhorn = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val rhydon = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "TERRA" to listOf("VENENO", "PEDRA", "METAL", "FOGO", "ELETRICO")
    )
    val chansey = mapOf(
        "NORMAL" to listOf("")
    )
    val tangela = mapOf(
        "GRAMA" to  listOf ("AGUA", "TERRA", "PEDRA")
    )
    val kangaskhan = mapOf(
        "NORMAL" to listOf("")
    )
    val horsea = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val seadra = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val goldeen = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val seaking = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val staryu = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val starmie = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val MrMime = mapOf(
        "PSIQUICO" to listOf("LUTADOR","VENENO"),
        "FADA" to listOf("LUTADOR","DRAGAO","SOMBRIO")
    )
    val scyther = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val jynx = mapOf(
        "GELO" to listOf("TERRA","VOADOR","GRAMA","DRAGAO"),
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val electabuzz = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA")
    )
    val magmar = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val pinsir = mapOf(
        "INSETO" to listOf("GRAMA","PSIQUICO","SOMBRIO")
    )
    val tauros = mapOf(
        "NORMAL" to listOf("")
    )
    val magikarp = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val gyarados = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val lapras = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO"),
        "GELO" to listOf("TERRA","VOADOR","GRAMA","DRAGAO")
    )
    val ditto = mapOf(
        "NORMAL" to listOf("")
    )
    val eevee = mapOf(
        "NORMAL" to listOf("")
    )
    val vaporeon = mapOf(
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val jolteon = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA")
    )
    val flareon = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL")
    )
    val porygon = mapOf(
        "NORMAL" to listOf("")
    )
    val omanyte = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val omastar = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val kabuto = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val kabutops = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "AGUA" to listOf("TERRA","PEDRA","FOGO")
    )
    val aerodactyl = mapOf(
        "PEDRA" to listOf("VOADOR","INSETO","GELO"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val snorlax = mapOf(
        "NORMAL" to listOf("")
    )
    val articuno = mapOf(
        "GELO" to listOf("TERRA","VOADOR","GRAMA","DRAGAO"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val zapdos = mapOf(
        "ELETRICO" to listOf("VOADOR", "AGUA"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val moltres = mapOf(
        "FOGO" to listOf("GRAMA","INSETO","GELO","METAL"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val dratini = mapOf(
        "DRAGAO" to listOf("DRAGAO")
    )
    val dragonair = mapOf(
        "DRAGAO" to listOf("DRAGAO")
    )
    val dragonite = mapOf(
        "DRAGAO" to listOf("DRAGAO"),
        "VOADOR" to listOf("LUTADOR","INSETO","GRAMA")
    )
    val mewtwo = mapOf(
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
    val mew = mapOf(
        "PSIQUICO" to listOf("LUTADOR","VENENO")
    )
}
