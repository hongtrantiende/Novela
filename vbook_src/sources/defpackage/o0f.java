package defpackage;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o0f  reason: default package */
/* loaded from: classes.dex */
public final class o0f extends c3e {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0f(int i) {
        super(3);
        this.b = i;
    }

    @Override // defpackage.c3e
    public final Object q(Object obj) {
        switch (this.b) {
            case 0:
                gze gzeVar = (gze) obj;
                uc7 b = uc7.b();
                return new xze((Context) b.a(Context.class), (uga) b.a(uga.class), new mze((Context) uc7.b().a(Context.class), gzeVar, 0), gzeVar.a);
            default:
                c9f c9fVar = (c9f) obj;
                uc7 b2 = uc7.b();
                ArrayList arrayList = new ArrayList();
                jf8 jf8Var = new jf8(29);
                d41 d41Var = d41.e;
                knc.b((Context) uc7.b().a(Context.class));
                knc.a().c(d41Var);
                d41.d.contains(new bt3("json"));
                arrayList.add(jf8Var);
                return new z9f((Context) b2.a(Context.class), (uga) b2.a(uga.class));
        }
    }
}
