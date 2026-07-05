package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o75  reason: default package */
/* loaded from: classes.dex */
public abstract class o75 implements Comparable {
    public final String C;
    public final String D;
    public final long E;
    public final long F;
    public final boolean G;
    public final String a;
    public final n75 b;
    public final long c;
    public final int d;
    public final long e;
    public final zk3 f;

    public o75(String str, n75 n75Var, long j, int i, long j2, zk3 zk3Var, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = n75Var;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = zk3Var;
        this.C = str2;
        this.D = str3;
        this.E = j3;
        this.F = j4;
        this.G = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.e;
        if (j > longValue) {
            return 1;
        }
        if (j < l.longValue()) {
            return -1;
        }
        return 0;
    }
}
