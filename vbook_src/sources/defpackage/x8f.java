package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x8f  reason: default package */
/* loaded from: classes.dex */
public final class x8f {
    public ebf a;
    public qs5 b;
    public ArrayList c;
    public Uri d;

    public ArrayList a(OutputStream outputStream) {
        v8f v8fVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            int i = v8f.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                if (!arrayList3.isEmpty()) {
                    v8fVar = new v8f(outputStream, arrayList3);
                } else {
                    v8fVar = null;
                }
                if (v8fVar != null) {
                    arrayList.add(v8fVar);
                }
            } else {
                throw rs8.f(it);
            }
        }
        Iterator it2 = this.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        } else if (it2.next() != null) {
            vm1.h();
            return null;
        } else {
            OutputStream outputStream2 = (OutputStream) yf2.t(arrayList);
            throw null;
        }
    }
}
