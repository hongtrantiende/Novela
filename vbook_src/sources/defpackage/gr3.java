package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* renamed from: gr3  reason: default package */
/* loaded from: classes3.dex */
public final class gr3 extends n42 {
    public Iterator C;
    public Collection D;
    public String E;
    public String F;
    public /* synthetic */ Object a;
    public int b;
    public tj4 c;
    public int d;
    public final /* synthetic */ ia e;
    public Collection f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr3(ia iaVar, m42 m42Var) {
        super(m42Var);
        this.e = iaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
