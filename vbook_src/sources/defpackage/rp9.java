package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rp9  reason: default package */
/* loaded from: classes.dex */
public final class rp9 extends tp9 implements pf2 {
    public final g5a D;

    public rp9(vq4 vq4Var, qs5 qs5Var, g5a g5aVar, ArrayList arrayList, List list, List list2) {
        super(vq4Var, qs5Var, g5aVar, arrayList, list, list2);
        this.D = g5aVar;
    }

    @Override // defpackage.pf2
    public final long B(long j) {
        return this.D.d(j);
    }

    @Override // defpackage.pf2
    public final long C(long j, long j2) {
        return this.D.b(j, j2);
    }

    @Override // defpackage.tp9
    public final String a() {
        return null;
    }

    @Override // defpackage.pf2
    public final long b(long j) {
        return this.D.g(j);
    }

    @Override // defpackage.pf2
    public final long c(long j, long j2) {
        return this.D.e(j, j2);
    }

    @Override // defpackage.tp9
    public final zg9 e() {
        return null;
    }

    @Override // defpackage.pf2
    public final long g(long j, long j2) {
        return this.D.c(j, j2);
    }

    @Override // defpackage.pf2
    public final long k(long j, long j2) {
        g5a g5aVar = this.D;
        if (g5aVar.f != null) {
            return -9223372036854775807L;
        }
        long b = g5aVar.b(j, j2) + g5aVar.c(j, j2);
        return (g5aVar.e(b, j) + g5aVar.g(b)) - g5aVar.i;
    }

    @Override // defpackage.pf2
    public final zg9 l(long j) {
        return this.D.h(this, j);
    }

    @Override // defpackage.pf2
    public final long r(long j, long j2) {
        return this.D.f(j, j2);
    }

    @Override // defpackage.pf2
    public final boolean w() {
        return this.D.i();
    }

    @Override // defpackage.pf2
    public final long z() {
        return this.D.d;
    }

    @Override // defpackage.tp9
    public final pf2 d() {
        return this;
    }
}
