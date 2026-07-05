package defpackage;

import java.math.BigInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uv2  reason: default package */
/* loaded from: classes.dex */
public final class uv2 implements m4a {
    public final /* synthetic */ vv2 a;

    public uv2(vv2 vv2Var) {
        this.a = vv2Var;
    }

    @Override // defpackage.m4a
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        vv2 vv2Var = this.a;
        long j2 = vv2Var.b;
        BigInteger valueOf = BigInteger.valueOf((vv2Var.d.i * j) / 1000000);
        long j3 = vv2Var.c;
        p4a p4aVar = new p4a(j, a2d.j((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(vv2Var.f)).longValue() + j2) - 30000, vv2Var.b, j3 - 1));
        return new l4a(p4aVar, p4aVar);
    }

    @Override // defpackage.m4a
    public final long g() {
        vv2 vv2Var = this.a;
        return (vv2Var.f * 1000000) / vv2Var.d.i;
    }
}
