package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qsc  reason: default package */
/* loaded from: classes.dex */
public abstract class qsc {
    public static final fbe a;
    public static final ypa b;
    public static Paint c;

    static {
        Trace.beginSection(sxd.o("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new fbe();
        } else if (i >= 29) {
            a = new fbe();
        } else if (i >= 28) {
            a = new tsc();
        } else if (i >= 26) {
            a = new tsc();
        } else {
            Method method = ssc.g;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new fbe();
            } else {
                a = new fbe();
            }
        }
        b = new ypa(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, jp4 jp4Var, Resources resources, int i, String str, int i2, int i3, cw cwVar, boolean z) {
        Typeface y;
        Typeface build;
        FontFamily build2;
        boolean z2;
        int i4;
        Handler handler;
        if (jp4Var instanceof mp4) {
            mp4 mp4Var = (mp4) jp4Var;
            String str2 = mp4Var.d;
            y = null;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = mp4Var.a;
                if (arrayList.size() == 1) {
                    build = c(((cp4) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < arrayList.size()) {
                                if (c(((cp4) arrayList.get(i5)).e) == null) {
                                    break;
                                }
                                i5++;
                            } else {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList.size()) {
                                        break;
                                    }
                                    cp4 cp4Var = (cp4) arrayList.get(i6);
                                    if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(cp4Var.f)) {
                                        customFallbackBuilder.setSystemFallback(cp4Var.e);
                                        break;
                                    }
                                    String str3 = cp4Var.e;
                                    String str4 = cp4Var.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + cp4Var.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (!TextUtils.isEmpty(str4)) {
                                        try {
                                            build2 = new FontFamily.Builder(psc.a(d).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build2 = new FontFamily.Builder(d).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build2);
                                    }
                                    i6++;
                                }
                                build = customFallbackBuilder.build();
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (cwVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ex2(24, cwVar, build));
                }
                b.m(b(resources, i, str, i2, i3), build);
                return build;
            }
            if (!z ? cwVar == null : mp4Var.c == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = mp4Var.b;
            } else {
                i4 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            k57 k57Var = new k57(12, false);
            k57Var.b = cwVar;
            ArrayList arrayList2 = mp4Var.a;
            aq9 aq9Var = new aq9(handler2, 0);
            s6f s6fVar = new s6f(k57Var, aq9Var);
            if (z2) {
                if (arrayList2.size() <= 1) {
                    cp4 cp4Var2 = (cp4) arrayList2.get(0);
                    ypa ypaVar = ip4.a;
                    ArrayList arrayList3 = new ArrayList(1);
                    Object obj = new Object[]{cp4Var2}[0];
                    Objects.requireNonNull(obj);
                    arrayList3.add(obj);
                    String a2 = ip4.a(i3, Collections.unmodifiableList(arrayList3));
                    Typeface typeface = (Typeface) ip4.a.h(a2);
                    if (typeface != null) {
                        aq9Var.execute(new bv4(2, k57Var, typeface));
                        y = typeface;
                    } else if (i4 == -1) {
                        Object[] objArr = {cp4Var2};
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj2 = objArr[0];
                        Objects.requireNonNull(obj2);
                        arrayList4.add(obj2);
                        hp4 b2 = ip4.b(a2, context, Collections.unmodifiableList(arrayList4), i3);
                        s6fVar.I(b2);
                        y = b2.a;
                    } else {
                        try {
                            try {
                                try {
                                    hp4 hp4Var = (hp4) ip4.b.submit(new fp4(a2, context, cp4Var2, i3, 0)).get(i4, TimeUnit.MILLISECONDS);
                                    s6fVar.I(hp4Var);
                                    y = hp4Var.a;
                                } catch (InterruptedException e) {
                                    throw e;
                                }
                            } catch (ExecutionException e2) {
                                throw new RuntimeException(e2);
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused3) {
                            ((aq9) s6fVar.b).execute(new t51((k57) s6fVar.a, -3));
                        }
                    }
                } else {
                    vs.m("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
            } else {
                String a3 = ip4.a(i3, arrayList2);
                Typeface typeface2 = (Typeface) ip4.a.h(a3);
                if (typeface2 != null) {
                    aq9Var.execute(new bv4(2, k57Var, typeface2));
                    y = typeface2;
                } else {
                    gp4 gp4Var = new gp4(s6fVar, 0);
                    synchronized (ip4.c) {
                        try {
                            jla jlaVar = ip4.d;
                            ArrayList arrayList5 = (ArrayList) jlaVar.get(a3);
                            if (arrayList5 != null) {
                                arrayList5.add(gp4Var);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(gp4Var);
                                jlaVar.put(a3, arrayList6);
                                fp4 fp4Var = new fp4(a3, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = ip4.b;
                                gp4 gp4Var2 = new gp4(a3, 1);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                gp9 gp9Var = new gp9(1);
                                gp9Var.b = fp4Var;
                                gp9Var.c = gp4Var2;
                                gp9Var.d = handler;
                                threadPoolExecutor.execute(gp9Var);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            y = a.y(context, (kp4) jp4Var, resources, i3);
            if (cwVar != null) {
                if (y != null) {
                    new Handler(Looper.getMainLooper()).post(new ex2(24, cwVar, y));
                } else {
                    cwVar.b(-3);
                }
            }
        }
        if (y != null) {
            b.m(b(resources, i, str, i2, i3), y);
        }
        return y;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, (float) nae.e, (float) nae.e, false, c);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }
}
