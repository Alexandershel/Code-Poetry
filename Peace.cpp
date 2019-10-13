// Give Peace a Chance

class peace();

void main()
{
    int hope = rand() % 100;
	int chance = rand() % 100;
	
    if(hope == chance)
    {
        throw peace();
    }
}
