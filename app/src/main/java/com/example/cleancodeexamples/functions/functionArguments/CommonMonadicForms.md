boolean fileExists(“MyFile”)

InputStream fileOpen(“MyFile”)

void passwordAttemptFailedNtimes(int attempts) //event tracking

Using an output argument instead of a return value for a transformation is confusing.
eg: void includeSetupPageInto(StringBuffer pageText)


void transform(StringBuffer out)   -> StringBuffer transform(StringBuffer in)