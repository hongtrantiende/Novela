package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b9f  reason: default package */
/* loaded from: classes.dex */
public final class b9f {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public b9f(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ebf ebfVar = (ebf) it.next();
            if (TextUtils.isEmpty(ebfVar.zzc())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                ebf ebfVar2 = (ebf) this.a.put(ebfVar.zzc(), ebfVar);
                if (ebfVar2 != null) {
                    String canonicalName = ebfVar2.getClass().getCanonicalName();
                    String canonicalName2 = ebfVar.getClass().getCanonicalName();
                    vs.m(nk2.w(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            this.c.addAll(list);
            return;
        }
        throw rs8.f(it2);
    }

    public final Object a(Uri uri, z8f z8fVar) {
        return z8fVar.d(b(uri));
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [x8f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [x8f, java.lang.Object] */
    public final x8f b(Uri uri) {
        List list;
        ls5 i = qs5.i();
        ls5 i2 = qs5.i();
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment) && encodedFragment.startsWith("transform=")) {
            String substring = encodedFragment.substring(10);
            uu5 d = uu5.d("+");
            list = qs5.k(new dxa(new uu5((exa) d.d, true, (ec1) d.c, d.b), substring));
        } else {
            list = mm9.e;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            String str = (String) list.get(i3);
            Matcher matcher = paf.a.matcher(str);
            if (matcher.matches()) {
                i2.b(matcher.group(1));
            } else {
                vs.m("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
        }
        mm9 g = i2.g();
        if (g.d <= 0) {
            qs5 u = i.g().u();
            ?? obj = new Object();
            String scheme = uri.getScheme();
            ebf ebfVar = (ebf) this.a.get(scheme);
            if (ebfVar != null) {
                obj.a = ebfVar;
                obj.c = this.c;
                obj.b = u;
                if (!u.isEmpty()) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                        String str2 = (String) arrayList.get(arrayList.size() - 1);
                        ListIterator listIterator = u.listIterator(u.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous() != null) {
                                vm1.h();
                                return null;
                            }
                        }
                        arrayList.set(arrayList.size() - 1, str2);
                        uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                    }
                }
                obj.d = uri;
                ?? obj2 = new Object();
                obj2.a = obj.a;
                obj2.b = obj.b;
                obj2.c = obj.c;
                obj2.d = obj.d;
                return obj2;
            }
            throw new IOException(s21.m("Requested backend isn't registered: ", scheme));
        }
        String str3 = (String) g.get(0);
        if (this.b.get(str3) != null) {
            vm1.h();
            return null;
        }
        String valueOf = String.valueOf(uri);
        throw new IOException(nk2.w(new StringBuilder(str3.length() + 40 + valueOf.length()), "Requested transform isn't registered: ", str3, ": ", valueOf));
    }
}
