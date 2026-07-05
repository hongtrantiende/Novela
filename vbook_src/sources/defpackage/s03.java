package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s03  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s03 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s03(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((t03) obj3).a.submit(new ex2(2, (Callable) obj2, (mce) obj));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((v69) obj3).e;
                dnd x = workDatabase.x();
                x.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) gae.l(x.a, true, false, new and(str, 1)));
                return workDatabase.w().e(str);
        }
    }
}
