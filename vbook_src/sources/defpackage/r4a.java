package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r4a  reason: default package */
/* loaded from: classes.dex */
public final class r4a {
    public long a;
    public r4d b;
    public boolean c;
    public float d;
    public final fs e = new fs(nae.e);
    public fs f;
    public long g;
    public long h;

    public final String toString() {
        long j = this.a;
        r4d r4dVar = this.b;
        boolean z = this.c;
        float f = this.d;
        fs fsVar = this.f;
        long j2 = this.g;
        long j3 = this.h;
        StringBuilder sb = new StringBuilder("progress nanos: ");
        sb.append(j);
        sb.append(", animationSpec: ");
        sb.append(r4dVar);
        sb.append(", isComplete: ");
        sb.append(z);
        sb.append(", value: ");
        sb.append(f);
        sb.append(", start: ");
        sb.append(this.e);
        sb.append(", initialVelocity: ");
        sb.append(fsVar);
        rs8.x(sb, ", durationNanos: ", j2, ", animationSpecDuration: ");
        sb.append(j3);
        return sb.toString();
    }
}
