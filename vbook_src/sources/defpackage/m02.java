package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m02  reason: default package */
/* loaded from: classes.dex */
public abstract class m02 {
    public final omd a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public m02(Context context, omd omdVar) {
        this.a = omdVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 != null && obj2.equals(obj)) {
                return;
            }
            this.e = obj;
            this.a.d.execute(new b9(15, sl1.C0(this.d), this));
        }
    }

    public abstract void c();

    public abstract void d();
}
