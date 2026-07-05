package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x30  reason: default package */
/* loaded from: classes.dex */
public final class x30 implements ura {
    public final /* synthetic */ int a = 1;
    public int b;
    public long c;
    public int d;

    public x30(int i, long j, int i2) {
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(a2d.d0(this.b));
                sb.append(", size=");
                sb.append(this.c);
                sb.append(", minHeaderSize=");
                return rs8.g(this.d, "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ x30() {
    }
}
