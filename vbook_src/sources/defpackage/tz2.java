package defpackage;

import java.util.zip.Deflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tz2  reason: default package */
/* loaded from: classes3.dex */
public final class tz2 extends n42 {
    public final /* synthetic */ vz2 C;
    public int D;
    public n07 a;
    public uwd b;
    public byte[] c;
    public byte[] d;
    public Deflater e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz2(vz2 vz2Var, n42 n42Var) {
        super(n42Var);
        this.C = vz2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, null, nae.e, this);
    }
}
