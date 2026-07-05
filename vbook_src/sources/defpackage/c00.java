package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c00  reason: default package */
/* loaded from: classes3.dex */
public final class c00 implements b9a {
    public final /* synthetic */ int a;
    public final Object b;

    public c00() {
        this.a = 4;
        this.b = new ArrayList();
    }

    public void b(Object obj, String str) {
        ((ArrayList) this.b).add(new w3d(obj, str));
    }

    @Override // defpackage.b9a
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new b2((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return h9a.O((lu4) obj);
            case 3:
                return new ap6((CharSequence) obj);
            default:
                return ((ArrayList) obj).iterator();
        }
    }

    public /* synthetic */ c00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
