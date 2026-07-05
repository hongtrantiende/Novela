package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteAction;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.style.TypefaceSpan;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ru  reason: default package */
/* loaded from: classes.dex */
public abstract class ru {
    public static String a;
    public static int b;
    public static Boolean c;

    public static Uri A(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static ClassLoader B() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean C(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public static boolean D(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }

    public static byte E(nv6 nv6Var) {
        return Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(nv6Var.a).getDigitStrings()[0], 0));
    }

    public static int F(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int G(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int H(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int I(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void J(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void K(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void L(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void M(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static void N(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final void O(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static Person P(nu8 nu8Var) {
        return new Person.Builder().setName(nu8Var.a).setIcon(null).setUri(nu8Var.b).setKey(nu8Var.c).setBot(nu8Var.d).setImportant(nu8Var.e).build();
    }

    public static boolean Q() {
        Boolean bool = c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke != null) {
                        bool = (Boolean) invoke;
                    } else {
                        throw new gt1(nqe.C("expected a non-null reference", objArr), 17);
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            c = bool;
        }
        return bool.booleanValue();
    }

    public static void a(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            k4.A(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static final DisplayCutout b(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (!(obj instanceof DisplayCutout)) {
                return null;
            }
            return (DisplayCutout) obj;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            yt0.h.getClass();
            Log.w(xt0.b, e);
            return null;
        }
    }

    public static void c(Menu menu, int i, Context context, TextClassification textClassification, int i2, Drawable drawable) {
        int i3;
        boolean z = true;
        int i4 = 2;
        if (i2 < 0) {
            MenuItem add = menu.add(16908353, 16908353, i, textClassification.getLabel());
            add.setShowAsAction(2);
            add.setIcon(drawable);
            add.setOnMenuItemClickListener(new ym(1, context, textClassification));
            return;
        }
        if (i2 != 0) {
            z = false;
        }
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        if (z) {
            i3 = 16908353;
        } else {
            i3 = 0;
        }
        MenuItem add2 = menu.add(16908353, i3, i, remoteAction.getTitle());
        if (!z) {
            i4 = 0;
        }
        add2.setShowAsAction(i4);
        if (drawable != null) {
            add2.setIcon(drawable);
        }
        add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: w2c
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ru.a(remoteAction);
                return true;
            }
        });
    }

    public static void d(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static final void e(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static Typeface f(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler h(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler i(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static w18 j(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                r95 n = r95.n();
                String str = w18.b;
                String str2 = w18.b;
                String str3 = "Ignoring adding capability '" + i + '\'';
                if (n.b <= 5) {
                    Log.w(str2, str3, e);
                }
            }
        }
        int[] iArr3 = bbe.f;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!b00.R(i3, iArr)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    r95 n2 = r95.n();
                    String str4 = w18.b;
                    String str5 = w18.b;
                    String str6 = "Ignoring removing default capability '" + i3 + '\'';
                    if (n2.b <= 5) {
                        Log.w(str5, str6, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new w18(build);
    }

    public static TextClassifier k(Context context, e6a e6aVar) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int ordinal = e6aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str = "textview";
            } else {
                xk5.o();
                return null;
            }
        } else {
            str = "edittext";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static TypefaceSpan l(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    public static List m(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] n(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long o(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static String p() {
        BufferedReader bufferedReader;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int i = b;
                if (i == 0) {
                    i = Process.myPid();
                    b = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                str = null;
                try {
                    if (i > 0) {
                        try {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                            sb.append("/proc/");
                            sb.append(i);
                            sb.append("/cmdline");
                            String sb2 = sb.toString();
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            bufferedReader = new BufferedReader(new FileReader(sb2));
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (IOException unused) {
                            bufferedReader = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            String readLine = bufferedReader.readLine();
                            am8.s(readLine);
                            str = readLine.trim();
                            bufferedReader.close();
                        } catch (IOException unused2) {
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            a = str;
                            return a;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                }
                a = str;
            }
        }
        return a;
    }

    public static void q(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static String r() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int s(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String t(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int u(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int v(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int w(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int x(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params y(lw lwVar) {
        return lwVar.getTextMetricsParams();
    }

    public static int z(Object obj) {
        return ((Icon) obj).getType();
    }
}
