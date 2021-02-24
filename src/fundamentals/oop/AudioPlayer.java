package fundamentals.oop;

public class AudioPlayer {
	protected boolean openSpeaker(Speaker sp) {
		// implementation details
		return true;
	}
	
	class StreamingAudioPlayer extends AudioPlayer{
		protected boolean openSpeaker(Speaker sp) {
			// implementation details
			return true;
		}
	}
}