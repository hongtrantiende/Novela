package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z1c  reason: default package */
/* loaded from: classes3.dex */
public final class z1c {
    public final int a;
    public final long b;

    public z1c(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1c)) {
            return false;
        }
        z1c z1cVar = (z1c) obj;
        if (this.a == z1cVar.a && this.b == z1cVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextToSpeechProgressState(chapterProgress=" + this.a + ", endDuration=" + this.b + ")";
    }
}
