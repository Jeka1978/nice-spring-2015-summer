package immutable;

/**
 * Created by Jeka on 10/07/2016.
 */
public class Person {
    private final String name;
    private final int debt;
    private final int bonus;

    private Person(String name, int debt, int bonus) {
        this.name = name;
        this.debt = debt;
        this.bonus = bonus;
    }

    public static class Builder{
        private String name;
        private int debt;
        private int bonus;
        private boolean alreadyUsed;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }
        public Person build() {
            if (alreadyUsed) {
                throw new RuntimeException("builder already used");
            }
            alreadyUsed = true;
            validate();
            return new Person(name, debt, bonus);
        }

        private void validate() {
            if (name == null) {
                throw new RuntimeException("name is mandatory");
            }
        }
    }



    public Person setName(String name) {
        return new Person(name, debt, bonus);
    }

    public Person setDebt(int debt) {
        return new Person(name, debt, bonus);
    }

    public Person setBonus(int bonus) {
        return new Person(name, debt, bonus);
    }

    public String getName() {
        return name;
    }

    public int getDebt() {
        return debt;
    }

    public int getBonus() {
        return bonus;
    }

    public String toString() {
        return "immutable.Person(name=" + this.getName() + ", debt=" + this.getDebt() + ", bonus=" + this.getBonus() + ")";
    }
}
