package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x03  reason: default package */
/* loaded from: classes.dex */
public final class x03 extends mla implements y7b {
    public final o8b n;

    public x03(o8b o8bVar) {
        super(new e8b[2], new ha1[2]);
        boolean z;
        int i = this.g;
        cr2[] cr2VarArr = this.e;
        if (i == cr2VarArr.length) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        for (cr2 cr2Var : cr2VarArr) {
            cr2Var.p(1024);
        }
        this.n = o8bVar;
    }

    @Override // defpackage.mla
    public final cr2 g() {
        return new cr2(1);
    }

    @Override // defpackage.mla
    public final dr2 h() {
        return new ha1(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ab2, java.lang.Exception] */
    @Override // defpackage.mla
    public final ab2 i(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    @Override // defpackage.mla
    public final ab2 j(cr2 cr2Var, dr2 dr2Var, boolean z) {
        e8b e8bVar = (e8b) cr2Var;
        ha1 ha1Var = (ha1) dr2Var;
        try {
            ByteBuffer byteBuffer = e8bVar.e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            o8b o8bVar = this.n;
            if (z) {
                o8bVar.reset();
            }
            x7b f = o8bVar.f(array, 0, limit);
            long j = e8bVar.C;
            long j2 = e8bVar.F;
            ha1Var.c = j;
            ha1Var.e = f;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            ha1Var.f = j;
            ha1Var.d = false;
            return null;
        } catch (z7b e) {
            return e;
        }
    }

    @Override // defpackage.y7b
    public final void c(long j) {
    }
}
