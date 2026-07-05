package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.vbook.android.R;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aye  reason: default package */
/* loaded from: classes.dex */
public abstract class aye {
    public static kn9 e;
    public static String f;
    public static final tu1 a = new tu1(new iv1(26), false, -1515209349);
    public static final tu1 b = new tu1(new iv1(27), false, 1862854360);
    public static final tu1 c = new tu1(new jv1(18), false, 917903060);
    public static final tu1 d = new tu1(new jv1(19), false, 369952416);
    public static final Object g = new Object();

    public static final float a(float f2, float f3, ri8 ri8Var) {
        float f4;
        int ordinal = ri8Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (f2 > f3) {
                        f4 = -(f2 - f3);
                    } else {
                        return (f3 - f2) / 2.0f;
                    }
                } else {
                    xk5.o();
                }
            }
            return nae.e;
        } else if (f2 > f3) {
            f4 = f2 - f3;
        } else {
            f4 = -(f3 - f2);
        }
        return f4 / 2.0f;
    }

    public static final float b(float f2, float f3, si8 si8Var) {
        float f4;
        int ordinal = si8Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (f2 > f3) {
                        f4 = -(f2 - f3);
                    } else {
                        return (f3 - f2) / 2.0f;
                    }
                } else {
                    xk5.o();
                    return nae.e;
                }
            } else {
                if (f2 <= f3) {
                    return nae.e;
                }
                f4 = f2 - f3;
            }
        } else {
            if (f2 <= f3) {
                f4 = -(f3 - f2);
            }
            f4 = f2 - f3;
        }
        return f4 / 2.0f;
    }

    public static final Drawable c(ml5 ml5Var, Resources resources) {
        if (ml5Var instanceof sk3) {
            return ((sk3) ml5Var).a;
        }
        if (ml5Var instanceof ql0) {
            return new BitmapDrawable(resources, ((ql0) ml5Var).a);
        }
        return new en5(ml5Var);
    }

    public static final ml5 d(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return new ql0(((BitmapDrawable) drawable).getBitmap());
        }
        return new sk3(drawable);
    }

    public static final xy4 e(xy4 xy4Var, nm1 nm1Var) {
        return xy4Var.d(new fg0(nm1Var));
    }

    public static final void f(WorkDatabase workDatabase, xy1 xy1Var, amd amdVar) {
        int i;
        workDatabase.getClass();
        xy1Var.getClass();
        ArrayList C = tl1.C(amdVar);
        int i2 = 0;
        while (!C.isEmpty()) {
            List<umd> list = ((amd) xl1.R(C)).d;
            list.getClass();
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (umd umdVar : list) {
                    if (!umdVar.b.j.i.isEmpty() && (i = i + 1) < 0) {
                        tl1.L();
                        throw null;
                    }
                }
                continue;
            }
            i2 += i;
        }
        if (i2 != 0) {
            int intValue = ((Number) gae.l(workDatabase.w().a, true, false, new x8d(14))).intValue();
            int i3 = xy1Var.j;
            if (intValue + i2 <= i3) {
                return;
            }
            vs.m(rs8.g(i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", hl5.r(i3, intValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
        }
    }

    public static String g(a31 a31Var) {
        StringBuilder sb = new StringBuilder(a31Var.size());
        for (int i = 0; i < a31Var.size(); i++) {
            byte a2 = a31Var.a(i);
            if (a2 != 34) {
                if (a2 != 39) {
                    if (a2 != 92) {
                        switch (a2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a2 >= 32 && a2 <= 126) {
                                    sb.append((char) a2);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a2 >>> 6) & 3) + 48));
                                    sb.append((char) (((a2 >>> 3) & 7) + 48));
                                    sb.append((char) ((a2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final int h(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj == null) {
                    obj = tag;
                } else if (!tag.equals(obj)) {
                    break;
                }
                i3 = i2;
            }
            i2++;
            ViewParent q = gue.q(view);
            if (q instanceof View) {
                view = (View) q;
            } else {
                view = null;
            }
        }
        return i3;
    }

    public static final View i(View view) {
        View view2;
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(h(view, R.id.view_tree_lifecycle_owner), h(view, R.id.view_tree_saved_state_registry_owner));
        View view3 = view;
        int i = 0;
        View view4 = view3;
        while (view != null) {
            if (i == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view3;
                }
            } else if (j(view) == null) {
                i++;
                ViewParent q = gue.q(view);
                if (q instanceof View) {
                    view2 = (View) q;
                } else {
                    view2 = null;
                }
                View view5 = view3;
                view3 = view;
                view = view2;
                view4 = view5;
            }
            return view;
        }
        return view4;
    }

    public static final vw1 j(View view) {
        WeakReference weakReference;
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        if (tag instanceof WeakReference) {
            weakReference = (WeakReference) tag;
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            return null;
        }
        return (vw1) weakReference.get();
    }

    public static ApplicationInfo k(Context context) {
        s0a.o("HttpFlagsLoader#getProviderApplicationInfo");
        try {
            ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
            if (resolveService == null) {
                Log.i("HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                Trace.endSection();
                return null;
            }
            ApplicationInfo applicationInfo = resolveService.serviceInfo.applicationInfo;
            Trace.endSection();
            return applicationInfo;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final f5a l(Object obj) {
        if (obj != sy1.a) {
            return (f5a) obj;
        }
        vs.k("Does not contain segment");
        return null;
    }

    public static final yk8 m(float f2, float f3, float f4, ri8 ri8Var) {
        float f5 = (f2 * f3) - f4;
        float abs = Math.abs(f5) / 2.0f;
        int ordinal = ri8Var.ordinal();
        float f6 = nae.e;
        if (ordinal != 0) {
            Float f7 = null;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (f5 >= nae.e) {
                        return new yk8(Float.valueOf(-abs), Float.valueOf(abs));
                    }
                    return new yk8(Float.valueOf(abs), Float.valueOf(abs));
                }
                xk5.o();
                return null;
            }
            Float valueOf = Float.valueOf(abs);
            if (f5 >= nae.e) {
                f7 = valueOf;
            }
            if (f7 != null) {
                f6 = f7.floatValue();
            }
            return new yk8(Float.valueOf(-f6), Float.valueOf(f6));
        } else if (f5 >= nae.e) {
            return new yk8(Float.valueOf(-abs), Float.valueOf(abs));
        } else {
            float f8 = -abs;
            return new yk8(Float.valueOf(f8), Float.valueOf(f8));
        }
    }

    public static final boolean n(Object obj) {
        if (obj == sy1.a) {
            return true;
        }
        return false;
    }

    public static ii4 o(Context context) {
        try {
            ApplicationInfo k = k(context);
            if (k != null) {
                String str = k.packageName;
                Log.d("HttpFlagsLoader", "Found application exporting HTTP flags: " + str);
                File file = new File(new File(new File(k.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                String absolutePath = file.getAbsolutePath();
                Log.d("HttpFlagsLoader", "HTTP flags file path: " + absolutePath);
                ii4 p = p(file);
                if (p != null) {
                    Log.d("HttpFlagsLoader", "Successfully loaded HTTP flags: " + p);
                    return p;
                }
            }
            return null;
        } catch (RuntimeException e2) {
            Log.i("HttpFlagsLoader", "Unable to load HTTP flags file", e2);
            return null;
        }
    }

    public static ii4 p(File file) {
        s0a.o("HttpFlagsLoader#loadFlagsFile");
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    ii4 g2 = ii4.g(fileInputStream);
                    fileInputStream.close();
                    Trace.endSection();
                    return g2;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    Trace.endSection();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            String path = file.getPath();
            Log.i("HttpFlagsLoader", "HTTP flags file `" + path + "` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.");
            Trace.endSection();
            return null;
        } catch (IOException e2) {
            throw new RuntimeException("Unable to read HTTP flags file", e2);
        }
    }

    public static final mce q(String str) {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        try {
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Throwable unused) {
        }
        try {
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
        } catch (Throwable unused2) {
        }
        try {
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        } catch (Throwable unused3) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Throwable unused4) {
        }
        try {
            newInstance.setXIncludeAware(false);
        } catch (Throwable unused5) {
        }
        try {
            newInstance.setExpandEntityReferences(false);
        } catch (Throwable unused6) {
        }
        try {
            newInstance.setNamespaceAware(false);
        } catch (Throwable unused7) {
        }
        try {
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            byte[] bytes = str.getBytes(ed1.a);
            bytes.getClass();
            Document parse = newDocumentBuilder.parse(new ByteArrayInputStream(bytes));
            Element documentElement = parse.getDocumentElement();
            if (documentElement != null) {
                documentElement.normalize();
            }
            return new mce(parse);
        } catch (Exception e2) {
            throw new Exception(s21.m("XML 파싱 실패: ", e2.getMessage()));
        }
    }

    public static final nq7 r(lu4 lu4Var) {
        return new qob(lu4Var);
    }

    public static final g27 s(xu9 xu9Var, rv4 rv4Var) {
        boolean f2 = rv4Var.f(xu9Var) | rv4Var.d(0);
        Object P = rv4Var.P();
        if (f2 || P == ax1.a) {
            P = new g27(xu9Var);
            rv4Var.o0(P);
        }
        return (g27) P;
    }

    public static final yk8 t(float f2, float f3, float f4, si8 si8Var) {
        float f5 = (f2 * f3) - f4;
        float abs = Math.abs(f5) / 2.0f;
        int ordinal = si8Var.ordinal();
        float f6 = nae.e;
        if (ordinal != 0) {
            Float f7 = null;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (f5 >= nae.e) {
                        return new yk8(Float.valueOf(-abs), Float.valueOf(abs));
                    }
                    return new yk8(Float.valueOf(abs), Float.valueOf(abs));
                }
                xk5.o();
                return null;
            }
            Float valueOf = Float.valueOf(abs);
            if (f5 >= nae.e) {
                f7 = valueOf;
            }
            if (f7 != null) {
                f6 = f7.floatValue();
            }
            return new yk8(Float.valueOf(-f6), Float.valueOf(f6));
        } else if (f5 >= nae.e) {
            return new yk8(Float.valueOf(-abs), Float.valueOf(abs));
        } else {
            float f8 = -abs;
            return new yk8(Float.valueOf(f8), Float.valueOf(f8));
        }
    }

    public static final ymd u(List list, ymd ymdVar) {
        ymd ymdVar2;
        list.getClass();
        ymdVar.getClass();
        boolean a2 = ymdVar.e.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean a3 = ymdVar.e.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean a4 = ymdVar.e.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!a2 && a3 && a4) {
            String str = ymdVar.c;
            sf2 sf2Var = new sf2(0);
            tf2 tf2Var = ymdVar.e;
            tf2Var.getClass();
            sf2Var.e(tf2Var.a);
            sf2Var.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            ymdVar2 = ymd.b(ymdVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", sf2Var.b(), 0, 0L, 0, 0, 0L, 0, 33554411);
        } else {
            ymdVar2 = ymdVar;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            w02 w02Var = ymdVar2.j;
            String str2 = ymdVar2.c;
            if (!c16.i(str2, ConstraintTrackingWorker.class.getName()) && (w02Var.e || w02Var.f)) {
                sf2 sf2Var2 = new sf2(0);
                tf2 tf2Var2 = ymdVar2.e;
                tf2Var2.getClass();
                sf2Var2.e(tf2Var2.a);
                sf2Var2.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
                return ymd.b(ymdVar2, null, null, ConstraintTrackingWorker.class.getName(), sf2Var2.b(), 0, 0L, 0, 0, 0L, 0, 33554411);
            }
        }
        return ymdVar2;
    }
}
