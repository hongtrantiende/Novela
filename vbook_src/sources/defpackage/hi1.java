package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hi1  reason: default package */
/* loaded from: classes3.dex */
public final class hi1 {
    public final String a;
    public List b = ks3.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public hi1(String str) {
        this.a = str;
    }

    public final void a(String str, o9a o9aVar) {
        str.getClass();
        o9aVar.getClass();
        if (this.d.add(str)) {
            this.c.add(str);
            this.e.add(o9aVar);
            this.f.add(ks3.a);
            this.g.add(Boolean.FALSE);
            return;
        }
        StringBuilder o = a82.o("Element with name '", str, "' is already registered in ");
        o.append(this.a);
        throw new IllegalArgumentException(o.toString().toString());
    }
}
