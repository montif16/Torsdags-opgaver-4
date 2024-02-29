class Main {

	public static void main(String[] args) {
		Team team1 = new Team("Første team");
		Team team2 = new Team("Andet team");
		Team team3 = new Team("Tredje team");
		Team team4 = new Team("Fjerde team");
		Team team5 = new Team("Femte team");
		team1.setRank(1);
		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());

	}
}