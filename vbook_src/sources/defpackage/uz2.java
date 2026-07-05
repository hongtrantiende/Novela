package defpackage;

import java.util.zip.Inflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uz2  reason: default package */
/* loaded from: classes3.dex */
public final class uz2 extends n42 {
    public /* synthetic */ Object C;
    public final /* synthetic */ vz2 D;
    public int E;
    public n07 a;
    public uwd b;
    public byte[] c;
    public byte[] d;
    public Inflater e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz2(vz2 vz2Var, n42 n42Var) {
        super(n42Var);
        this.D = vz2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(null, null, this);
    }
}
