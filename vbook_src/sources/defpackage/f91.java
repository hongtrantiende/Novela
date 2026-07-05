package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* renamed from: f91  reason: default package */
/* loaded from: classes3.dex */
public final class f91 extends n42 {
    public r81 C;
    public Collection D;
    public List E;
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bb c;
    public ilc d;
    public Collection e;
    public Iterator f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f91(bb bbVar, m42 m42Var) {
        super(m42Var);
        this.c = bbVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
