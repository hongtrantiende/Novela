package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g9e  reason: default package */
/* loaded from: classes.dex */
public final class g9e implements f78 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final ac4 g = new ac4(a82.q(eub.q(e8e.class, new h4e(1))), "key");
    public static final ac4 h = new ac4(a82.q(eub.q(e8e.class, new h4e(2))), ES6Iterator.VALUE_PROPERTY);
    public static final s8e i = s8e.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final e78 d;
    public final e99 e = new e99(this, 1);

    public g9e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, e78 e78Var) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = e78Var;
    }

    public static int j(ac4 ac4Var) {
        e8e e8eVar = (e8e) ((Annotation) ac4Var.b.get(e8e.class));
        if (e8eVar != null) {
            return e8eVar.zza();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // defpackage.f78
    public final f78 a(ac4 ac4Var, Object obj) {
        c(ac4Var, obj, true);
        return this;
    }

    public final void b(ac4 ac4Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((j(ac4Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ac4 ac4Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    l((j(ac4Var) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    l(bytes.length);
                    this.a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    c(ac4Var, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    k(i, ac4Var, entry, false);
                }
            } else if (obj instanceof Double) {
                b(ac4Var, ((Double) obj).doubleValue(), z);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != nae.e) {
                    l((j(ac4Var) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                i(ac4Var, ((Number) obj).longValue(), z);
            } else if (obj instanceof Boolean) {
                h(ac4Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                l((j(ac4Var) << 3) | 2);
                l(bArr.length);
                this.a.write(bArr);
            } else {
                e78 e78Var = (e78) this.b.get(obj.getClass());
                if (e78Var != null) {
                    k(e78Var, ac4Var, obj, z);
                    return;
                }
                x3d x3dVar = (x3d) this.c.get(obj.getClass());
                if (x3dVar != null) {
                    e99 e99Var = this.e;
                    e99Var.b = false;
                    e99Var.d = ac4Var;
                    e99Var.c = z;
                    x3dVar.a(obj, e99Var);
                } else if (obj instanceof a7e) {
                    h(ac4Var, ((a7e) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(ac4Var, ((Enum) obj).ordinal(), true);
                } else {
                    k(this.d, ac4Var, obj, z);
                }
            }
        }
    }

    @Override // defpackage.f78
    public final /* synthetic */ f78 d(ac4 ac4Var, boolean z) {
        h(ac4Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.f78
    public final /* synthetic */ f78 e(ac4 ac4Var, int i2) {
        h(ac4Var, i2, true);
        return this;
    }

    @Override // defpackage.f78
    public final f78 f(ac4 ac4Var, double d) {
        b(ac4Var, d, true);
        return this;
    }

    @Override // defpackage.f78
    public final /* synthetic */ f78 g(ac4 ac4Var, long j) {
        i(ac4Var, j, true);
        return this;
    }

    public final void h(ac4 ac4Var, int i2, boolean z) {
        if (!z || i2 != 0) {
            e8e e8eVar = (e8e) ((Annotation) ac4Var.b.get(e8e.class));
            if (e8eVar != null) {
                int ordinal = e8eVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((e8eVar.zza() << 3) | 5);
                        this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
                        return;
                    }
                    l(e8eVar.zza() << 3);
                    l((i2 + i2) ^ (i2 >> 31));
                    return;
                }
                l(e8eVar.zza() << 3);
                l(i2);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void i(ac4 ac4Var, long j, boolean z) {
        if (!z || j != 0) {
            e8e e8eVar = (e8e) ((Annotation) ac4Var.b.get(e8e.class));
            if (e8eVar != null) {
                int ordinal = e8eVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((e8eVar.zza() << 3) | 1);
                        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                        return;
                    }
                    l(e8eVar.zza() << 3);
                    m((j >> 63) ^ (j + j));
                    return;
                }
                l(e8eVar.zza() << 3);
                m(j);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void k(e78 e78Var, ac4 ac4Var, Object obj, boolean z) {
        rl6 rl6Var = new rl6(1);
        rl6Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = rl6Var;
            e78Var.a(obj, this);
            this.a = outputStream;
            long j = rl6Var.b;
            rl6Var.close();
            if (z && j == 0) {
                return;
            }
            l((j(ac4Var) << 3) | 2);
            m(j);
            e78Var.a(obj, this);
        } catch (Throwable th) {
            try {
                rl6Var.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final void l(int i2) {
        while (true) {
            int i3 = ((i2 & (-128)) > 0L ? 1 : ((i2 & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i3 != 0) {
                outputStream.write((i2 & Token.SWITCH) | Token.CASE);
                i2 >>>= 7;
            } else {
                outputStream.write(i2 & Token.SWITCH);
                return;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            int i2 = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i2 != 0) {
                outputStream.write((((int) j) & Token.SWITCH) | Token.CASE);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & Token.SWITCH);
                return;
            }
        }
    }
}
