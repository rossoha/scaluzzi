final case class MissingFinalConfig(
    @Description(
      "Report error on a missing `final` modifier for non-abstract classes " +
        "that extend a sealed class.")
    noLeakingSealed: Boolean = true,
    @Description("Insert the final modifier to case classes.")
    noLeakingCaseClass: Boolean = true
)
