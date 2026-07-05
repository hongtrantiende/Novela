package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb0  reason: default package */
/* loaded from: classes.dex */
public final class fb0 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public x92 g;
    public oa2 h;
    public na2 i;
    public y92 j;
    public List k;
    public int l;
    public byte m;

    public final gb0 a() {
        String str;
        String str2;
        x92 x92Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (x92Var = this.g) != null) {
            return new gb0(str, str2, this.c, this.d, this.e, this.f, x92Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        vs.k(s21.o("Missing required properties:", sb));
        return null;
    }
}
