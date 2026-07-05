package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ssc  reason: default package */
/* loaded from: classes.dex */
public final class ssc extends fbe {
    public static final Class e;
    public static final Constructor f;
    public static final Method g;
    public static final Method h;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f = constructor;
        e = cls;
        g = method2;
        h = method;
    }

    public static boolean K(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) g.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface L(Object obj) {
        try {
            Object newInstance = Array.newInstance(e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) h.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.fbe
    public final Typeface y(Context context, kp4 kp4Var, Resources resources, int i) {
        Object obj;
        lp4[] lp4VarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (lp4 lp4Var : kp4Var.a) {
                int i2 = lp4Var.f;
                File h0 = hbe.h0(context);
                if (h0 != null) {
                    try {
                        if (hbe.d0(h0, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(h0);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && K(obj, mappedByteBuffer, lp4Var.e, lp4Var.b, lp4Var.c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        h0.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return L(obj);
        }
        return null;
    }

    @Override // defpackage.fbe
    public final Typeface z(Context context, fq4[] fq4VarArr, int i) {
        Object obj;
        try {
            obj = f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            jla jlaVar = new jla(0);
            int length = fq4VarArr.length;
            while (true) {
                if (i2 < length) {
                    fq4 fq4Var = fq4VarArr[i2];
                    Uri uri = fq4Var.a;
                    ByteBuffer byteBuffer = (ByteBuffer) jlaVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = hbe.i0(context, uri);
                        jlaVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !K(obj, byteBuffer, fq4Var.b, fq4Var.c, fq4Var.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface L = L(obj);
                    if (L != null) {
                        return Typeface.create(L, i);
                    }
                }
            }
        }
        return null;
    }
}
