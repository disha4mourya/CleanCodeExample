Passing a boolean into a function is a truly terrible practice.
It immediately complicates the signature of the method, loudly proclaiming that this function does more than one thing.

render(true)
render(boolean isSuite)
  ||
  \/
renderForSuite() and renderForSingleTest()