package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fyc  reason: default package */
/* loaded from: classes.dex */
public final class fyc extends n42 {
    public final /* synthetic */ db2 C;
    public int D;
    public f31 a;
    public byte[] b;
    public Closeable c;
    public bz0 d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyc(db2 db2Var, n42 n42Var) {
        super(n42Var);
        this.C = db2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return db2.Y(this.C, null, null, this);
    }
}
