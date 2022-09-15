package com.orewjgbioerbj.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.findNavController
//import com.test.luckydrum.databinding.ActivityInfoqqaBinding

import com.orewjgbioerbj.databinding.ActivityInfoqqaBinding
import com.orewjgbioerbj.db.SheredPreference


class InfoActivityeee : AppCompatActivity() {
    private val binding by lazy { ActivityInfoqqaBinding.inflate(layoutInflater)}
    private var secondsBack:Long = 0

    override fun onBackPressed() {
        exit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvQestionwqwqlok.text = Model.list[Model.index]

        if(SheredPreference(this).get()){
            binding.CVgoTestwqwqlok.isVisible = false
            binding.btnNext.isVisible = false
            binding.btnTrue.isVisible = false
            SheredPreference(this).set(false)
        }else{
            binding.FLWelkomTutorial.isVisible = false

          }

         binding.CVgoTestwqwqlok.setOnClickListener {
             startActivity(Intent(this, TestActivityeee::class.java))
         }

        binding.Bok.setOnClickListener {
            binding.FLWelkomTutorial.isVisible = false
            binding.btnNext.isVisible = true
            binding.btnTrue.isVisible = true
            binding.CVgoTestwqwqlok.isVisible = true

        }

        binding.btnNext.setOnClickListener {
            if(Model.index != Model.list.size - 1) {
                ++Model.index
                binding.tvQestionwqwqlok.text = Model.list[Model.index]
            }

            binding.btnTrue .setOnClickListener {
                if(Model.index != 0) {
                    --Model.index
                    binding.tvQestionwqwqlok.text = Model.list[Model.index]
                }
            }

        }

    }


    override fun onDestroy() {
        super.onDestroy()
    }

    private fun exit(){
        if (secondsBack+2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        } else {
            Toast.makeText(getBaseContext(), "Press the back button twice to exit", Toast.LENGTH_SHORT).show();
        }
        secondsBack = System.currentTimeMillis()
    }
}
object Model{
    var index  = 0

    val list = listOf(
        "Poker is a family of comparing card games in which players wager over which hand is best " +
        "according to that specific game's rules in ways similar to these rankings. While the " +
        "earliest known form of the game was played with just 20 cards, today it is usually played" +
         " with a standard deck, although in countries where short packs are common, it may be played"+
        "with 32, 40 or 48 cards.[1]"+ "Thus poker games vary in deck configuration, the number of " +
         "cards in play, the number dealt face up or face down, and the number shared by all players" +
          ", but all have rules that involve one or more rounds of betting.",

        "In most modern poker games, the first round of betting begins with one or more of the " +
                "players making some form of a forced bet (the blind or ante). In standard poker, " +
                "each player bets according to the rank they believe their hand is worth as compared" +
                " to the other players. The action then proceeds clockwise as each player in turn " +
                "must either match (or \"call\") the maximum previous bet, or fold, losing the amount" +
                " bet so far and all further involvement in the hand. A player who matches a bet may" +
                " also \"raise\" (increase) the bet. The betting round ends when all players have ",

                "either called the last bet or folded. If all but one player folds on any round, " +
                "the remaining player collects the pot without being required to reveal their hand." +
                " If more than one player remains in contention after the final betting round, a " +
                 "showdown takes place where the hands are revealed, and the player with the winning" +
                        " hand takes the pot.",

        "In most modern poker games, the first round of betting begins with one or more of " +
                "the players making some form of a forced bet (the blind or ante). In standard poker," +
                " each player bets according to the rank they believe their hand is worth as compared" +
                " to the other players. The action then proceeds clockwise as each player in turn must" +
                " either match (or \"call\") the maximum previous bet, or fold, losing the amount bet" +
                " so far and all further involvement in the hand. A player who matches a bet may also" +
                " \"raise\" (increase) the bet. The betting round ends when all players have either ",


       "called the last bet or folded. If all but one player folds on any round, the remaining" +
        " player collects the pot without being required to reveal their hand. If " +
        "more than one player remains in contention after the final betting round, a showdown " +
       "takes place where the hands are revealed, and the player with the winning hand takes the pot."+
        "In contrast to this version of poker, seven-card stud only appeared in the middle of the" +
         " 19th century, and was largely spread by the US military.[5] It became a staple in many " +
         "casinos following the second world war, and grew in popularity with the advent of the World" +
               " Series of Poker in the 1970s.",

       "Texas hold 'em and other community card games began to dominate the gambling scenes over the" +
        " next couple of decades. The televising of poker was a particularly strong influence increasing " +
        "the popularity of the game during the turn of the millennium, resulting in the poker boom a few" +
         " years later between 2003 and 2006. Today the game has grown to become an extremely popular " +
         "pastime worldwide.",

        "In casual play, the right to deal a hand typically rotates among the players and is marked " +
                "by a token called a dealer button (or buck). In a casino, a house dealer handles the cards" +
                " for each hand, but the button (typically a white plastic disk) is rotated clockwise among " +
                "the players to indicate a nominal dealer to determine the order of betting. The cards are dealt" +
                " clockwise around the poker table, one at a time.\n" +
                "One or more players are usually required to make forced bets, usually either an ante or" +
                " a blind bet (sometimes both). The dealer shuffles the cards, the player on the chair to" +
                " his or her right cuts, and the dealer deals the appropriate number of cards to the players " +
                "one at a time, beginning with the player to his or her left. Cards may be dealt either " +
                "face-up or face-down, depending on the variant of poker being played. After the initial deal," +
                " the first of what may be several betting rounds begins. Between rounds, the players' hands " +
                "develop in some way, often by being dealt additional cards or replacing cards previously dealt." +
                " At the end of each round, all bets are gathered into the central pot.",

        "At any time during a betting round, if one player bets, no opponents choose to call (match) the bet," +
                " and all opponents instead fold, the hand ends immediately, the bettor is awarded the pot," +
                " no cards are required to be shown, and the next hand begins. This is what makes bluffing " +
                "possible. Bluffing is a primary feature of poker, distinguishing it from other vying games" +
                " and from other games that use poker hand rankings.\n" +
                "At the end of the last betting round, if more than one player remains, there is a " +
                "showdown, in which the players reveal their previously hidden cards and evaluate their " +
                "hands. The player with the best hand according to the poker variant being played wins " +
                "the pot. A poker hand comprises five cards; in variants where a player has more than " +
                "five cards available to them, only the best five-card combination counts. There are 10 " +
                "different kinds of poker hands, such as straight flush and four of a kind.",

        "Poker has many variations,[7][8] all following a similar pattern of play[9] and generally using" +
                " the same hand ranking hierarchy. There are four main families of variants, largely grouped" +
                " by the protocol of card-dealing and betting:\n" +
                "\n" +
                "Straight\n" +
                "A complete hand is dealt to each player, and players bet in one round, with raising and re-raising " +
                "allowed. This is the oldest poker family; the root of the game as now played was a game known as " +
                "Primero, which evolved into the game three-card brag, a very popular gentleman's game around the time" +
                " of the American Revolutionary War and still enjoyed in the U.K. today. Straight hands of five cards" +
                " are sometimes used as a final showdown, but poker is almost always played in a more complex form to " +
                "allow for additional strategy.",

        "Stud poker\n" +
                "Cards are dealt in a prearranged combination of face-down and face-up rounds, or streets," +
                " with a round of betting following each. This is the next-oldest family; as poker " +
                "progressed from three to five-card hands, they were often dealt one card at a time, " +
                "either face-down or face-up, with a betting round between each. The most popular stud " +
                "variant today, seven-card stud, deals two extra cards to each player (three face-down," +
                " four face-up) from which they must make the best possible 5-card hand.\n" +
                "Draw poker\n" +
                "Five-card draw: A complete hand is dealt to each player, face-down. Then each player " +
                "must place an ante to the pot. They can then see their cards and bet accordingly. After " +
                "betting, players can discard up to three cards and take new ones from the top of the deck." +
                " Then, another round of betting takes place. Finally, each player must show his or her cards" +
                " and the player with the best hand wins.",

        "Community card poker\n" +
                "Also known as \"flop poker\", community card poker is a variation of stud poker. Players" +
                " are dealt an incomplete hand of face-down cards, and then a number of face-up community" +
                " cards are dealt to the centre of the table, each of which can be used by one or more of" +
                " the players to make a 5-card hand. Texas hold 'em and Omaha are two well-known variants" +
                " of the community card family.\n",

                "There are several methods for defining the structure of betting during a hand of poker." +
                " The three most common structures are known as \"fixed-limit\", \"pot-limit\", and" +
                " \"no-limit\". In fixed-limit poker, betting and raising must be done by standardised " +
                "amounts. For instance, if the required bet is X, an initial bettor may only bet X; if" +
                " a player wishes to raise a bet, they may only raise by X. In pot-limit poker, a player" +
                " may bet or raise any amount up to the size of the pot. When calculating the maximum" +
                " raise allowed, all previous bets and calls, including the intending raiser's call, are" +
                " first added to the pot. The raiser may then raise the previous bet by the full amount" +
                " of the pot. In no-limit poker, a player may wager their entire betting stack at any" +
                " point that they are allowed to make a bet. In all games, if a player does not have " +
                "enough betting chips to fully match a bet, they may go \"all-in\", allowing them to " +
                "show down their hand for the amount of chips they have remaining.",

        "While typical poker games award the pot to the highest hand as per the standard ranking of poker" +
                " hands, there are variations where the best hand, and thus the hand awarded the pot, is" +
                " the lowest-ranked hand instead. In such games the best hand contains the lowest cards " +
                "rather than the highest cards; some variations may be further complicated by whether " +
                "or not hands such as flushes and straights are considered in the hand rankings. There" +
                " are also games where the highest and lowest hands divide the pot between them, known " +
                "as \"high low split\" games.",

        "Other games that use poker hand rankings may likewise be referred to as poker. Video poker is" +
                " a single-player video game that functions much like a slot machine; most video poker" +
                " machines play draw poker, where the player bets, a hand is dealt, and the player can " +
                "discard and replace cards. Payout is dependent on the hand resulting after the draw and" +
                " the player's initial bet.\n" +
                "\n" +
                "Strip poker is a traditional poker variation where players remove clothing when they lose" +
                " bets. Since it depends only on the basic mechanic of betting in rounds, strip poker can " +
                "be played with any form of poker; however, it is usually based on simple variants with few" +
                " betting rounds, like five card draw.",

        "Another game with the poker name, but with a vastly different mode of play, is called Acey-Deucey" +
                " or Red Dog poker. This game is more similar to Blackjack in its layout and betting; " +
                "each player bets against the house, and then is dealt two cards. For the player to win," +
                " the third card dealt (after an opportunity to raise the bet) must have a value in-between" +
                " the first two. Payout is based on the odds that this is possible, based on the difference" +
                " in values of the first two cards. Other poker-like games played at casinos against the house" +
                " include three card poker and pai gow poker.",

        "A variety of computer poker players have been developed by researchers at the University of Alberta," +
                " Carnegie Mellon University, and the University of Auckland amongst others.\n" +
                "\n" +
                "In a January 2015 article[10] published in Science, a group of researchers mostly from the" +
                " University of Alberta announced that they \"essentially weakly solved\" heads-up limit " +
                "Texas Hold 'em with their development of their Cepheus poker bot. The authors claimed that" +
                " Cepheus would lose at most 0.001 big blinds per game on average against its worst-case" +
                " opponent, and the strategy is thus so \"close to optimal\" that \"it can't be beaten with" +
                " statistical significance within a lifetime of human poker playing\".",

        "Online poker is the game of poker played over the Internet. It has been partly responsible for a huge" +
                "increase in the number of poker players worldwide. Christiansen Capital Advisors stated " +
                "online poker revenues grew from \$82.7 million in 2001 to \$2.4 billion in 2005,[1] while" +
                " a survey carried out by DrKW and Global Betting and Gaming Consultants asserted online" +
                " poker revenues in 2004 were at \$1.4 billion.[2] In a testimony before the United States " +
                "Senate regarding Internet Gaming, Grant Eve, a Certified Public Accountant representing the" +
                " US Accounting Firm Joseph Eve, Certified Public Accountants, estimated that one in every" +
                " four dollars gambled is gambled online.",

        "Traditional (or \"brick and mortar\", B&M, live, land-based) venues for playing poker, such as casinos" +
                " and poker rooms, may be intimidating for novice players and are often located in geographically" +
                " disparate locations. Also, brick and mortar casinos are reluctant to promote poker because it" +
                " is difficult for them to profit from it. Though the rake, or time charge, of traditional casinos" +
                " is often high, the opportunity costs of running a poker room are even higher. Brick and mortar" +
                " casinos often make much more money by removing poker rooms and adding more slot machines. For " +
                "example, figures from the Gaming Accounting Firm Joseph Eve estimate that poker accounts for 1%" +
                " of brick and mortar casino revenues.",

        "Online venues, by contrast, are dramatically cheaper because they have much smaller overhead costs. For" +
                " example, adding another table does not take up valuable space like it would for a brick and" +
                " mortar casino. Online poker rooms also allow the players to play for low stakes (as low as" +
                " 1¢/2¢) and often offer poker freeroll tournaments (where there is no entry fee), attracting" +
                " beginners and/or less wealthy clientele.",

        "Online venues may be more vulnerable to certain types of fraud, especially collusion between players. " +
                "However, they have collusion detection abilities that do not exist in brick and mortar casinos." +
                " For example, online poker room security employees can look at the hand history of the cards " +
                "previously played by any player on the site, making patterns of behavior easier to detect than " +
                "in a casino where colluding players can simply fold their hands without anyone ever knowing the " +
                "strength of their holding. Online poker rooms also check players' IP addresses in order to prevent" +
                " players at the same household or at known open proxy servers from playing on the same tables. " +
                "Digital device fingerprinting also allows poker sites to recognize and block players who create new" +
                " accounts in attempts to circumvent prior account bans, restrictions and closures."
    )

    fun countModel(): String {
        return list[index]
    }

    fun moveIndex(){
        if(index<list.size-1){
            index++
        }else{
            index = 0
        }
    }
}

