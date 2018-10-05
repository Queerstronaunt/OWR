(ns overwatch-characters.core
  (:gen-class))

(def overwatch-heros [
  {:name "Lucio"
  :role "support"
  :age "26"
  :affliation "none"
  :base-of-operations "Rio de Janeiro, Brazil"
  :occupation "DJ, Freedom Fighter"
  :full-name "Lúcio Correia dos Santos"
  :ability-1 [:name "Sonic Amplifier"
  :description "Lúcio can hit his enemies with sonic projectiles or knock them back with a blast of sound."]
  :ability-2 [:name "Crossfade"
  :description "Lúcio continuously energizes himself—and nearby teammates—with music. He can switch between two songs: one amplifies movement speed, while the other regenerates health."]
  :ability-3 [:name "Amp It Up"
  :description "Lúcio increases the volume on his speakers, boosting the effects of his songs."]
  :ultimate-ability [:name "Sound Barrier"
  :description "Protective waves radiate out from Lúcio’s Sonic Amplifier, briefly providing him and nearby allies with personal shields."]}
  {:name "Ana"
  :role "support"
  :age "60"
  :affliation "Overwatch (formerly)"
  :base-of-operations "Cairo, Egypt"
  :occupation "Bounty Hunter"
  :full-name "Ana Amari"
  :ability-1 [:name "Biotic Rifle"
  :description "Ana’s rifle shoots darts that can restore health to her allies or deal ongoing damage to her enemies. She can use the rifle’s scope to zoom in on targets and make highly accurate shots."]
  :ability-2 [:name "Sleep Dart"
  :description "Ana fires a dart from her sidearm, rendering an enemy unconscious (though any damage will rouse them)."]
  :ability-3 [:name "Biotic Grenade"
  :description "Ana tosses a biotic bomb that deals damage to enemies and heals allies in a small area of effect. Affected allies briefly receive increased healing from all sources, while enemies caught in the blast cannot be healed for a few moments."]
  :ultimate-ability [:name "Nano Boost"
  :description "After Ana hits one of her allies with a combat boost, they deal more damage, and take less damage from enemies’ attacks."]}
  {:name "Brigitte"
  :role "support"
  :age "23"
  :affliation "none"
  :base-of-operations "Gothenburg, Sweden (formerly)"
  :occupation "Mechanical Engineer, Adventurer"
  :full-name "Brigitte Lindholm"
  :ability-1 [:name "Rocket Flail"
  :description "Brigitte's melee weapon has an extended range, enabling her to strike multiple enemies with a single swing."]
  :ability-2 [:name "Repair Pack"
  :description "Brigitte throws a Repair Pack that can heal an ally. Any healing over that ally’s maximum health provides them with armor instead."]
  :ability-3 [:name "Whip Shot"
  :description "Brigitte throws her flail a long distance, dealing damage and knocking an enemy away from her."]
  :ability-4 [:name "Barrier Shield"
  :description "Brigitte deploys a frontal energy barrier to absorb a limited amount of damage. "]
  :ability-5 [:name "Shield Bash"
  :description "Once her Barrier Shield is deployed, Brigitte can dash forward to stun an enemy."]
  :ultimate-ability [:name "Rally"
  :description "Brigitte moves faster and provides all nearby allies with armor that lasts until it’s removed by damage. "]}
  {:name "Mercy"
    :role "support"
    :age "37"
    :affliation "Overwatch (formerly)"
    :base-of-operations "Zürich, Switzerland"
    :occupation "Field Medic, First Responder"
    :full-name "Angela Ziegler"
    :ability-1 [:name "Caduceus Staff"
    :description "Mercy engages one of two beams that connect to an ally. By maintaining the beams, she can either restore that ally’s health or increase the amount of damage they deal."]
    :ability-2 [:name "Caduceus Blaster"
    :description "Mercy shoots a round from her sidearm. "]
    :ability-3 [:name "Guardian Angel"
    :description "Mercy flies towards a targeted ally, allowing her to reach them quickly and provide assistance in crucial moments."]
    :ability-4 [:name "Resurrect"
    :description "Mercy brings a dead ally back into the fight with full health. "]
    :ability-5 [:name "Angelic Descent"
    :description "Propelled by her Valkyrie suit, Mercy slows the speed of her descent from great heights."]
    :ultimate-ability [:name "Valkyrie"
    :description "Gain the ability to fly. Mercy’s abilities are enhanced. "]}
    {:name "Moira"
     :role "support"
     :age "48"
     :affliation "Talon; Blackwatch (formerly)"
     :base-of-operations "Dublin, Ireland; Oasis, Iraq"
     :occupation "Geneticist"
     :full-name "Moira O’Deorain"
     :ability-1 [:name "Biotic Grasp"
     :description "Using her left hand, Moira expends biotic energy to heal allies in front of her. Her right hand fires a long-range beam weapon that saps enemies’ health, healing Moira and replenishing her biotic energy."]
     :ability-2 [:name "Biotic Orb"
     :description "Moira launches a rebounding biotic sphere; she can choose between a regeneration effect that heals the allies it passes through, or a decay effect that deals damage to enemies. "]
     :ability-3 [:name "Fade"
     :description "Moira quickly teleports a short distance."]
     :ultimate-ability [:name "Coalescence"
     :description "Moira channels a long-range beam that both heals allies and bypasses barriers to damage her enemies."]}
     {:name "Zenyatta"
       :role "support"
       :age "20"
       :affliation "The Shambali (formerly)"
       :base-of-operations "Shambali Monastery, Nepal (formerly)"
       :occupation "Wandering Guru, Adventurer"
       :full-name "Tekhartha Zenyatta"
       :ability-1 [:name "Orb of Destruction"
       :description "Zenyatta projects his destructive energy orbs either individually, or in a rapid-fire volley after a few seconds spent gathering power."]
       :ability-2 [:name "Orb of Harmony"
       :description "Zenyatta casts an orb over the shoulder of a targeted ally. So long as Zenyatta maintains line of sight, the orb slowly restores health to his ally. Only one ally can receive the orb's benefit at a time."]
       :ability-3 [:name "Orb of Discord"
       :description "Attaching the orb of discord to an opponent amplifies the amount of damage they receive for as long as Zenyatta maintains line of sight. Only one opponent can suffer the orb's effects at a time."]
       :ultimate-ability [:name "Transcendence"
       :description "Zenyatta enters a state of heightened existence for a short period of time. While transcendent, Zenyatta cannot use abilities or weapons, but is immune to damage and automatically restores his health and that of nearby allies."]}
  ]
