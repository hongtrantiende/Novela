package com.google.android.gms.net;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class a {
    public static final vz4 a = vz4.b;
    public static final Object b = new Object();
    public static zm3 c = null;
    public static String d = "0";
    public static boolean e;

    public static void a(Context context) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
            taskCompletionSource.setResult(null);
            synchronized (b) {
                e = true;
            }
            taskCompletionSource.getTask();
        } else if (b()) {
            taskCompletionSource.setResult(null);
            taskCompletionSource.getTask();
        } else {
            Trace.beginSection("PlayServices CronetProviderInstaller#installProvider starting thread");
            try {
                new Thread(new bv4(15, context, taskCompletionSource)).start();
                Trace.endSection();
                taskCompletionSource.getTask();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static boolean b() {
        Object obj = b;
        synchronized (obj) {
            try {
                boolean z = true;
                if (e) {
                    return true;
                }
                synchronized (obj) {
                    zm3 zm3Var = c;
                    if (zm3Var == null) {
                        z = false;
                    }
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context) {
        synchronized (b) {
            try {
                if (b()) {
                    return;
                }
                hge hgeVar = new hge(context, 37401, 1.0f);
                Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded");
                am8.t(context, "Context must not be null");
                if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                    e = true;
                    hgeVar.f = 0;
                    Trace.endSection();
                    hgeVar.close();
                    return;
                }
                ClassLoader classLoader = a.class.getClassLoader();
                am8.s(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable");
                    try {
                        vz4 vz4Var = a;
                        vz4Var.getClass();
                        vz4.d(context);
                        Trace.endSection();
                        try {
                            Trace.beginSection("CronetProviderInstaller#installIfNeeded DynamiteModule#load");
                            try {
                                zm3 c2 = zm3.c(context, zm3.b, "com.google.android.gms.cronet_dynamite");
                                Trace.endSection();
                                try {
                                    Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded loading class");
                                    try {
                                        Class<?> loadClass = c2.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                        if (loadClass.getClassLoader() != a.class.getClassLoader()) {
                                            Method method = loadClass.getMethod("getApiLevel", null);
                                            Method method2 = loadClass.getMethod("getCronetVersion", null);
                                            Integer num = (Integer) method.invoke(null, null);
                                            am8.s(num);
                                            int intValue = num.intValue();
                                            String str = (String) method2.invoke(null, null);
                                            am8.s(str);
                                            d = str;
                                            Trace.endSection();
                                            if (apiLevel > intValue) {
                                                if (vz4Var.a(context, "cr", 2) == null) {
                                                    Log.e("a", "Unable to fetch error resolution intent");
                                                    throw new Exception();
                                                }
                                                String str2 = d;
                                                StringBuilder sb = new StringBuilder(String.valueOf(apiLevel).length() + Token.ASSIGN_EXP + String.valueOf(intValue).length() + 39 + String.valueOf(str2).length());
                                                sb.append("Google Play Services update is required. The API Level of the client is ");
                                                sb.append(apiLevel);
                                                sb.append(". The API Level of the implementation is ");
                                                sb.append(intValue);
                                                sb.append(". The Cronet implementation version is ");
                                                sb.append(str2);
                                                throw new Exception(sb.toString());
                                            }
                                            c = c2;
                                            hgeVar.f = 0;
                                            Trace.endSection();
                                            hgeVar.close();
                                            return;
                                        }
                                        Log.e("a", "ImplVersion class is missing from Cronet module.");
                                        throw new Exception();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    Log.e("a", "Unable to read Cronet version from the Cronet module ", e2);
                                    throw ((q05) new Exception().initCause(e2));
                                }
                            } finally {
                                try {
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        } catch (wm3 e3) {
                            Log.e("a", "Unable to load Cronet module", e3);
                            throw ((q05) new Exception().initCause(e3));
                        }
                    } catch (Throwable th3) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (ClassNotFoundException e4) {
                    Log.e("a", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((q05) new Exception().initCause(e4));
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
