package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oe4  reason: default package */
/* loaded from: classes.dex */
public final class oe4 implements na4, a2e {
    public final Object C;
    public final Object D;
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public oe4(Context context) {
        String str;
        String replaceAll;
        this.a = 0;
        String str2 = ((wb0) p69.a.b(context)).a;
        this.b = str2;
        File filesDir = context.getFilesDir();
        this.c = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = fca.C(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        d(file);
        this.d = file;
        File file2 = new File(file, "open-sessions");
        d(file2);
        this.e = file2;
        File file3 = new File(file, "reports");
        d(file3);
        this.f = file3;
        File file4 = new File(file, "priority-reports");
        d(file4);
        this.C = file4;
        File file5 = new File(file, "native-reports");
        d(file5);
        this.D = file5;
    }

    public static synchronized void d(File file) {
        synchronized (oe4.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean e(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                e(file2);
            }
        }
        return file.delete();
    }

    public static List f(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.c, str);
        if (file.exists() && e(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public Object b() {
        Map map = (Map) ((uy1) this.C).e(ef5.a);
        if (map != null) {
            return map.get(ki5.a);
        }
        return null;
    }

    public File c(String str, String str2) {
        File file = new File((File) this.e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void g(String str) {
        o40 o40Var = (o40) this.f;
        synchronized (o40Var) {
            try {
                if (!((k96) ((AtomicMarkableReference) o40Var.b).getReference()).b(str)) {
                    return;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) o40Var.b;
                atomicMarkableReference.set((k96) atomicMarkableReference.getReference(), true);
                e09 e09Var = new e09(o40Var, 8);
                AtomicReference atomicReference = (AtomicReference) o40Var.c;
                while (!atomicReference.compareAndSet(null, e09Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                ((wa2) ((ij1) ((oe4) o40Var.d).d).c).a(e09Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.k99
    public Object get() {
        return new eha((wba) ((j99) this.b).get(), (eba) ((j99) this.c).get(), (dba) ((j99) this.d).get(), (t9c) ((j99) this.e).get(), (ng2) ((j99) this.f).get(), (n69) ((j99) this.C).get(), (d82) ((j99) this.D).get());
    }

    @Override // defpackage.a2e
    public void k(l1e l1eVar) {
        List list;
        String str = (String) this.d;
        String str2 = (String) this.b;
        List list2 = (List) ((r3e) l1eVar).a.b;
        if (list2 != null && !list2.isEmpty()) {
            int i = 0;
            x3e x3eVar = (x3e) list2.get(0);
            x47 x47Var = x3eVar.f;
            if (x47Var != null) {
                list = x47Var.a;
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    ((v4e) list.get(0)).e = str;
                } else {
                    while (true) {
                        if (i >= list.size()) {
                            break;
                        } else if (((v4e) list.get(i)).d.equals(str2)) {
                            ((v4e) list.get(i)).e = str;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            x3eVar.j = ((Boolean) this.e).booleanValue();
            x3eVar.k = (hde) this.f;
            ((rwa) this.C).f((p4e) this.D, x3eVar);
            return;
        }
        ((a2e) this.c).mo0zza("No users.");
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "HttpRequestData(url=" + ((vyc) this.b) + ", method=" + ((pg5) this.c) + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public void mo0zza(String str) {
        ((a2e) this.c).mo0zza(str);
    }

    public oe4(j99 j99Var, j99 j99Var2, j99 j99Var3, j99 j99Var4, j99 j99Var5, j99 j99Var6, j99 j99Var7) {
        this.a = 2;
        this.b = j99Var;
        this.c = j99Var2;
        this.d = j99Var3;
        this.e = j99Var4;
        this.f = j99Var5;
        this.C = j99Var6;
        this.D = j99Var7;
    }

    public oe4(k57 k57Var, a2e a2eVar, String str, String str2, Boolean bool, hde hdeVar, rwa rwaVar, p4e p4eVar) {
        this.a = 4;
        this.c = a2eVar;
        this.b = str;
        this.d = str2;
        this.e = bool;
        this.f = hdeVar;
        this.C = rwaVar;
        this.D = p4eVar;
    }

    public oe4(String str, oe4 oe4Var, ij1 ij1Var) {
        this.a = 3;
        this.e = new o40(this, false);
        this.f = new o40(this, true);
        this.C = new jt1(12, (byte) 0);
        this.D = new AtomicMarkableReference(null, false);
        this.b = str;
        this.c = new qb7(oe4Var);
        this.d = ij1Var;
    }

    public oe4(vyc vycVar, pg5 pg5Var, r45 r45Var, rf8 rf8Var, b9b b9bVar, uy1 uy1Var) {
        Object obj;
        this.a = 1;
        pg5Var.getClass();
        b9bVar.getClass();
        uy1Var.getClass();
        this.b = vycVar;
        this.c = pg5Var;
        this.d = r45Var;
        this.e = rf8Var;
        this.f = b9bVar;
        this.C = uy1Var;
        Map map = (Map) uy1Var.e(ef5.a);
        this.D = (map == null || (obj = map.keySet()) == null) ? rs3.a : obj;
    }
}
