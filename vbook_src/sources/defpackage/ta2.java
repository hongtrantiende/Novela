package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ta2  reason: default package */
/* loaded from: classes.dex */
public final class ta2 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final sa2 g = new Object();
    public static final uk h = new uk(7);
    public static final e92 i = new e92(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final oe4 b;
    public final tc0 c;
    public final f92 d;

    public ta2(oe4 oe4Var, tc0 tc0Var, f92 f92Var) {
        this.b = oe4Var;
        this.c = tc0Var;
        this.d = f92Var;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        oe4 oe4Var = this.b;
        arrayList.addAll(oe4.f(((File) oe4Var.C).listFiles()));
        arrayList.addAll(oe4.f(((File) oe4Var.D).listFiles()));
        uk ukVar = h;
        Collections.sort(arrayList, ukVar);
        List f2 = oe4.f(((File) oe4Var.f).listFiles());
        Collections.sort(f2, ukVar);
        arrayList.addAll(f2);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(oe4.f(((File) this.b.e).list())).descendingSet();
    }

    public final void d(ma2 ma2Var, String str, boolean z) {
        String str2;
        oe4 oe4Var = this.b;
        int i2 = this.c.b().a.b;
        g.getClass();
        String h2 = sa2.a.h(ma2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement()));
        if (z) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(oe4Var.c(str, hl5.n("event", format, str2)), h2);
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        e92 e92Var = new e92(3);
        oe4Var.getClass();
        File file = new File((File) oe4Var.e, str);
        file.mkdirs();
        List<File> f2 = oe4.f(file.listFiles(e92Var));
        Collections.sort(f2, new uk(8));
        int size = f2.size();
        for (File file2 : f2) {
            if (size > i2) {
                oe4.e(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
