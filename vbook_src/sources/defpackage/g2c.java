package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g2c  reason: default package */
/* loaded from: classes3.dex */
public final class g2c extends n42 {
    public final /* synthetic */ i2c C;
    public int D;
    public LinkedHashSet a;
    public Iterator b;
    public f76 c;
    public lj9 d;
    public lj9 e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2c(i2c i2cVar, n42 n42Var) {
        super(n42Var);
        this.C = i2cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.q(null, this);
    }
}
