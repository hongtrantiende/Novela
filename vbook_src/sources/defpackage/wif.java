package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wif  reason: default package */
/* loaded from: classes.dex */
public final class wif extends sjf {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wif(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // defpackage.sjf
    public void a(Iterator it, vkf vkfVar) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.a;
                    if (!hasNext) {
                        vkfVar.a(next, str);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(next);
                    do {
                        sb.append(',');
                        sb.append(it.next());
                    } while (it.hasNext());
                    sb.append(']');
                    vkfVar.a(sb.toString(), str);
                    return;
                }
                return;
            default:
                super.a(it, vkfVar);
                return;
        }
    }

    @Override // defpackage.sjf
    public void b(Object obj, vkf vkfVar) {
        boolean z;
        switch (this.f) {
            case 1:
                myd mydVar = (myd) obj;
                if (mydVar != null) {
                    kyd kydVar = mydVar.a.c;
                    kydVar.getClass();
                    int i = 0;
                    while (true) {
                        if (i < kydVar.b() - kydVar.a()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (i < kydVar.b() - kydVar.a()) {
                                lyd lydVar = kydVar.b;
                                int a = kydVar.a() + i;
                                i++;
                                Map.Entry entry = (Map.Entry) lydVar.a[a];
                                if (!((Set) entry.getValue()).isEmpty()) {
                                    for (Object obj2 : (Set) entry.getValue()) {
                                        vkfVar.a(obj2, (String) entry.getKey());
                                    }
                                } else {
                                    vkfVar.a(null, (String) entry.getKey());
                                }
                            } else {
                                xk5.g();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.b(obj, vkfVar);
                return;
        }
    }
}
