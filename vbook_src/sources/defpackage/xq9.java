package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xq9  reason: default package */
/* loaded from: classes3.dex */
public final class xq9 extends pe4 {
    public static final hn8 f;
    public final ClassLoader c;
    public final pe4 d;
    public final mfb e;

    static {
        String str = hn8.b;
        f = fn8.d("/", false);
    }

    public xq9(ClassLoader classLoader) {
        m66 m66Var = pe4.a;
        m66Var.getClass();
        this.c = classLoader;
        this.d = m66Var;
        this.e = new mfb(new ak9(this, 5));
    }

    public static String l1(hn8 hn8Var) {
        hn8 hn8Var2 = f;
        hn8Var2.getClass();
        hn8Var.getClass();
        return e.b(hn8Var2, hn8Var, true).d(hn8Var2).a.t();
    }

    @Override // defpackage.pe4
    public final yd4 I0(hn8 hn8Var) {
        hn8Var.getClass();
        if (fn8.a(hn8Var)) {
            String l1 = l1(hn8Var);
            for (yk8 yk8Var : (List) this.e.getValue()) {
                yd4 I0 = ((pe4) yk8Var.a).I0(((hn8) yk8Var.b).e(l1));
                if (I0 != null) {
                    return I0;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.pe4
    public final x56 N0(hn8 hn8Var) {
        if (fn8.a(hn8Var)) {
            String l1 = l1(hn8Var);
            Iterator it = ((List) this.e.getValue()).iterator();
            while (it.hasNext()) {
                yk8 yk8Var = (yk8) it.next();
                try {
                    return ((pe4) yk8Var.a).N0(((hn8) yk8Var.b).e(l1));
                } catch (FileNotFoundException unused) {
                }
            }
            fb4.h(hn8Var, "file not found: ");
            return null;
        }
        fb4.h(hn8Var, "file not found: ");
        return null;
    }

    @Override // defpackage.pe4
    public final void Q(hn8 hn8Var) {
        hn8Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pe4
    public final void V(hn8 hn8Var, boolean z) {
        hn8Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pe4
    public final x56 V0(hn8 hn8Var) {
        hn8Var.getClass();
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.pe4
    public final yma g1(hn8 hn8Var, boolean z) {
        hn8Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pe4
    public final osa k1(hn8 hn8Var) {
        hn8Var.getClass();
        if (fn8.a(hn8Var)) {
            hn8 hn8Var2 = f;
            hn8Var2.getClass();
            URL resource = this.c.getResource(e.b(hn8Var2, hn8Var, false).d(hn8Var2).a.t());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                inputStream.getClass();
                return tl1.K(inputStream);
            }
            fb4.h(hn8Var, "file not found: ");
            return null;
        }
        fb4.h(hn8Var, "file not found: ");
        return null;
    }

    @Override // defpackage.pe4
    public final List m0(hn8 hn8Var) {
        hn8Var.getClass();
        String l1 = l1(hn8Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (yk8 yk8Var : (List) this.e.getValue()) {
            pe4 pe4Var = (pe4) yk8Var.a;
            hn8 hn8Var2 = (hn8) yk8Var.b;
            try {
                List m0 = pe4Var.m0(hn8Var2.e(l1));
                ArrayList arrayList = new ArrayList();
                for (Object obj : m0) {
                    if (fn8.a((hn8) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(fn8.h((hn8) obj2, hn8Var2));
                }
                xl1.P(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return sl1.C0(linkedHashSet);
        }
        fb4.h(hn8Var, "file not found: ");
        return null;
    }

    @Override // defpackage.pe4
    public final yma o(hn8 hn8Var) {
        hn8Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pe4
    public final List p0(hn8 hn8Var) {
        hn8Var.getClass();
        String l1 = l1(hn8Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.e.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            yk8 yk8Var = (yk8) it.next();
            hn8 hn8Var2 = (hn8) yk8Var.b;
            List p0 = ((pe4) yk8Var.a).p0(hn8Var2.e(l1));
            if (p0 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : p0) {
                    if (fn8.a((hn8) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(tl1.s(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    arrayList3.add(fn8.h((hn8) obj2, hn8Var2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                xl1.P(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return sl1.C0(linkedHashSet);
    }

    @Override // defpackage.pe4
    public final void q(hn8 hn8Var, hn8 hn8Var2) {
        hn8Var.getClass();
        hn8Var2.getClass();
        throw new IOException(this + " is read-only");
    }
}
