package defpackage;

import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dlf  reason: default package */
/* loaded from: classes.dex */
public final class dlf {
    public static final blf e = new blf(0);
    public static final clf f = new clf(0);
    public final HashMap a;
    public final HashMap b;
    public final blf c;
    public clf d;

    public dlf(dlf dlfVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(dlfVar.a);
        hashMap2.putAll(dlfVar.b);
        this.c = dlfVar.c;
        this.d = dlfVar.d;
    }

    public void a(sjf sjfVar, Object obj, vkf vkfVar) {
        blf blfVar = (blf) this.a.get(sjfVar);
        if (blfVar != null) {
            blfVar.a(sjfVar, obj, vkfVar);
        } else {
            this.c.a(sjfVar, obj, vkfVar);
        }
    }

    public void b(sjf sjfVar, Iterator it, vkf vkfVar) {
        clf clfVar = (clf) this.b.get(sjfVar);
        if (clfVar != null) {
            clfVar.a(sjfVar, it, vkfVar);
            return;
        }
        clf clfVar2 = this.d;
        if (clfVar2 != null && !this.a.containsKey(sjfVar)) {
            clfVar2.a(sjfVar, it, vkfVar);
            return;
        }
        while (it.hasNext()) {
            a(sjfVar, it.next(), vkfVar);
        }
    }

    public /* synthetic */ dlf() {
        blf blfVar = pae.l;
        this.a = new HashMap();
        this.b = new HashMap();
        this.d = null;
        this.c = blfVar;
    }
}
