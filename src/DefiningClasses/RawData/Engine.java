package DefiningClasses.RawData;

public class Engine {
   private int engineSpeed;
   private int enginePower;

   public int getEnginePower() {
      return enginePower;
   }

   public Engine(int engineSpeed, int enginePower) {
      this.engineSpeed = engineSpeed;
      this.enginePower = enginePower;
   }
}
