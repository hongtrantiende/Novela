package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tsc  reason: default package */
/* loaded from: classes.dex */
public class tsc extends rsc {
    public final Class j;
    public final Constructor k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;

    public tsc() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = P(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = Q(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.j = cls;
        this.k = constructor;
        this.l = method2;
        this.m = method3;
        this.n = method4;
        this.o = method5;
        this.p = method;
    }

    public static Method P(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // defpackage.fbe
    public final Typeface B(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        Method method = this.l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.k.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!M(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.o.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (O(obj)) {
                    return N(obj);
                }
            }
            return null;
        }
        return super.B(context, resources, i, str, i2);
    }

    public final boolean M(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.p.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(Object obj) {
        try {
            return ((Boolean) this.n.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method Q(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.rsc, defpackage.fbe
    public final Typeface y(Context context, kp4 kp4Var, Resources resources, int i) {
        Object obj;
        Method method = this.l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.k.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                lp4[] lp4VarArr = kp4Var.a;
                int length = lp4VarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        lp4 lp4Var = lp4VarArr[i2];
                        String str = lp4Var.a;
                        int i3 = lp4Var.e;
                        int i4 = lp4Var.b;
                        boolean z = lp4Var.c;
                        FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(lp4Var.d);
                        tsc tscVar = this;
                        Context context2 = context;
                        if (!tscVar.M(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                            try {
                                tscVar.o.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            i2++;
                            this = tscVar;
                            context = context2;
                        }
                    } else {
                        tsc tscVar2 = this;
                        if (tscVar2.O(obj)) {
                            return tscVar2.N(obj);
                        }
                    }
                }
            }
            return null;
        }
        return super.y(context, kp4Var, resources, i);
    }

    @Override // defpackage.rsc, defpackage.fbe
    public final Typeface z(Context context, fq4[] fq4VarArr, int i) {
        Object obj;
        Typeface N;
        boolean z;
        if (fq4VarArr.length >= 1) {
            Method method = this.l;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (fq4 fq4Var : fq4VarArr) {
                        if (fq4Var.f == 0) {
                            Uri uri = fq4Var.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, hbe.i0(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = fq4VarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.o;
                            if (i2 < length) {
                                fq4 fq4Var2 = fq4VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(fq4Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.m.invoke(obj, byteBuffer, Integer.valueOf(fq4Var2.b), null, Integer.valueOf(fq4Var2.c), Integer.valueOf(fq4Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (O(obj) && (N = N(obj)) != null) {
                                return Typeface.create(N, i);
                            }
                        }
                    }
                } else {
                    fq4 C = fbe.C(fq4VarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(C.a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(C.c).setItalic(C.d).build();
                        openFileDescriptor.close();
                        return build;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }
}
