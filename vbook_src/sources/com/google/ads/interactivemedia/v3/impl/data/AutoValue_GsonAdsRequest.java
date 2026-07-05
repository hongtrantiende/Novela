package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$AutoPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$ContinuousPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState;
import com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_GsonAdsRequest extends GsonAdsRequest {
    private final l8f adTagParameters;
    private final String adTagUrl;
    private final String adsResponse;
    private final String apiKey;
    private final String assetKey;
    private final String authToken;
    private final l8f companionSlots;
    private final l8f consentSettings;
    private final Float contentDuration;
    private final a8f contentKeywords;
    private final String contentSourceId;
    private final String contentSourceUrl;
    private final String contentTitle;
    private final String contentUrl;
    private final String customAssetKey;
    private final CustomUiOptionsData customUiOptions;
    private final Integer daiIntegration;
    private final Boolean enableNonce;
    private final String env;
    private final String format;
    private final IdentifierInfo identifierInfo;
    private final Boolean isAndroidTvAdsFramework;
    private final Boolean isTv;
    private final Integer linearAdSlotHeight;
    private final Integer linearAdSlotWidth;
    private final String liveStreamEventId;
    private final Float liveStreamPrefetchSeconds;
    private final MarketAppInfo marketAppInfo;
    private final String msParameter;
    private final String network;
    private final String networkCode;
    private final String oAuthToken;
    private final Boolean omidAdSessionsOnStartedOnly;
    private final String pauseAdSlot;
    private final Double pixelDensity;
    private final l8f platformSignals;
    private final Integer preferredLinearOrientation;
    private final String projectNumber;
    private final String region;
    private final int rubidiumApiVersion;
    private final a8f secureSignals;
    private final ImaSdkSettingsData settings;
    private final String streamActivityMonitorId;
    private final Boolean supportsExternalNavigation;
    private final Boolean supportsIconClickFallback;
    private final Boolean supportsNativeClickSignals;
    private final Boolean supportsNativeNetworking;
    private final Boolean supportsNativeViewSignals;
    private final Boolean supportsOmidJsManagedAppSessions;
    private final Boolean supportsQuicksilver;
    private final Boolean supportsResizing;
    private final Boolean useQAStreamBaseUrl;
    private final Boolean usesCustomVideoPlayback;
    private final Float vastLoadTimeout;
    private final AdsRequestImpl$ContinuousPlayState videoContinuousPlay;
    private final VideoEnvironmentData videoEnvironment;
    private final String videoId;
    private final AdsRequestImpl$AutoPlayState videoPlayActivation;
    private final AdsRequestImpl$MutePlayState videoPlayMuted;
    private final l8f videoStitcherSessionOptions;
    private final String vodConfigId;
    private final Boolean wrappedCompanionsEnabled;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder implements GsonAdsRequest.Builder {
        private l8f adTagParameters;
        private String adTagUrl;
        private String adsResponse;
        private String apiKey;
        private String assetKey;
        private String authToken;
        private l8f companionSlots;
        private l8f consentSettings;
        private Float contentDuration;
        private a8f contentKeywords;
        private String contentSourceId;
        private String contentSourceUrl;
        private String contentTitle;
        private String contentUrl;
        private String customAssetKey;
        private CustomUiOptionsData customUiOptions;
        private Integer daiIntegration;
        private Boolean enableNonce;
        private String env;
        private String format;
        private IdentifierInfo identifierInfo;
        private Boolean isAndroidTvAdsFramework;
        private Boolean isTv;
        private Integer linearAdSlotHeight;
        private Integer linearAdSlotWidth;
        private String liveStreamEventId;
        private Float liveStreamPrefetchSeconds;
        private MarketAppInfo marketAppInfo;
        private String msParameter;
        private String network;
        private String networkCode;
        private String oAuthToken;
        private Boolean omidAdSessionsOnStartedOnly;
        private String pauseAdSlot;
        private Double pixelDensity;
        private l8f platformSignals;
        private Integer preferredLinearOrientation;
        private String projectNumber;
        private String region;
        private int rubidiumApiVersion;
        private a8f secureSignals;
        private byte set$0;
        private ImaSdkSettingsData settings;
        private String streamActivityMonitorId;
        private Boolean supportsExternalNavigation;
        private Boolean supportsIconClickFallback;
        private Boolean supportsNativeClickSignals;
        private Boolean supportsNativeNetworking;
        private Boolean supportsNativeViewSignals;
        private Boolean supportsOmidJsManagedAppSessions;
        private Boolean supportsQuicksilver;
        private Boolean supportsResizing;
        private Boolean useQAStreamBaseUrl;
        private Boolean usesCustomVideoPlayback;
        private Float vastLoadTimeout;
        private AdsRequestImpl$ContinuousPlayState videoContinuousPlay;
        private VideoEnvironmentData videoEnvironment;
        private String videoId;
        private AdsRequestImpl$AutoPlayState videoPlayActivation;
        private AdsRequestImpl$MutePlayState videoPlayMuted;
        private l8f videoStitcherSessionOptions;
        private String vodConfigId;
        private Boolean wrappedCompanionsEnabled;

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder adTagParameters(Map<String, String> map) {
            l8f a;
            if (map == null) {
                a = null;
            } else {
                a = l8f.a(map);
            }
            this.adTagParameters = a;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder adTagUrl(String str) {
            this.adTagUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder adsResponse(String str) {
            this.adsResponse = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder apiKey(String str) {
            this.apiKey = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder assetKey(String str) {
            this.assetKey = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder authToken(String str) {
            this.authToken = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest build() {
            if (this.set$0 == 1) {
                return new AutoValue_GsonAdsRequest(this.adTagParameters, this.adTagUrl, this.adsResponse, this.apiKey, this.assetKey, this.authToken, this.companionSlots, this.contentDuration, this.contentKeywords, this.contentSourceUrl, this.contentTitle, this.contentUrl, this.contentSourceId, this.consentSettings, this.customAssetKey, this.daiIntegration, this.enableNonce, this.env, this.secureSignals, this.format, this.identifierInfo, this.isTv, this.isAndroidTvAdsFramework, this.pauseAdSlot, this.wrappedCompanionsEnabled, this.linearAdSlotWidth, this.linearAdSlotHeight, this.liveStreamEventId, this.liveStreamPrefetchSeconds, this.marketAppInfo, this.msParameter, this.network, this.videoEnvironment, this.networkCode, this.oAuthToken, this.omidAdSessionsOnStartedOnly, this.pixelDensity, this.platformSignals, this.preferredLinearOrientation, this.projectNumber, this.region, this.settings, this.supportsExternalNavigation, this.supportsIconClickFallback, this.supportsNativeClickSignals, this.supportsNativeNetworking, this.supportsNativeViewSignals, this.supportsOmidJsManagedAppSessions, this.streamActivityMonitorId, this.supportsQuicksilver, this.supportsResizing, this.useQAStreamBaseUrl, this.usesCustomVideoPlayback, this.vastLoadTimeout, this.videoId, this.videoPlayActivation, this.videoContinuousPlay, this.videoPlayMuted, this.videoStitcherSessionOptions, this.vodConfigId, this.customUiOptions, this.rubidiumApiVersion, null);
            }
            vs.k("Missing required properties: rubidiumApiVersion");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder companionSlots(Map<String, String> map) {
            l8f a;
            if (map == null) {
                a = null;
            } else {
                a = l8f.a(map);
            }
            this.companionSlots = a;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder consentSettings(Map<String, String> map) {
            l8f a;
            if (map == null) {
                a = null;
            } else {
                a = l8f.a(map);
            }
            this.consentSettings = a;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentDuration(Float f) {
            this.contentDuration = f;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentKeywords(List<String> list) {
            a8f i;
            if (list == null) {
                i = null;
            } else {
                i = a8f.i(list);
            }
            this.contentKeywords = i;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentSourceId(String str) {
            this.contentSourceId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentSourceUrl(String str) {
            this.contentSourceUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentTitle(String str) {
            this.contentTitle = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentUrl(String str) {
            this.contentUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder customAssetKey(String str) {
            this.customAssetKey = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder customUiOptions(CustomUiOptionsData customUiOptionsData) {
            this.customUiOptions = customUiOptionsData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder daiIntegration(Integer num) {
            this.daiIntegration = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder enableNonce(Boolean bool) {
            this.enableNonce = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder env(String str) {
            this.env = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder format(String str) {
            this.format = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder identifierInfo(IdentifierInfo identifierInfo) {
            this.identifierInfo = identifierInfo;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder isAndroidTvAdsFramework(Boolean bool) {
            this.isAndroidTvAdsFramework = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder isTv(Boolean bool) {
            this.isTv = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder linearAdSlotHeight(Integer num) {
            this.linearAdSlotHeight = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder linearAdSlotWidth(Integer num) {
            this.linearAdSlotWidth = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder liveStreamEventId(String str) {
            this.liveStreamEventId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder liveStreamPrefetchSeconds(Float f) {
            this.liveStreamPrefetchSeconds = f;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder marketAppInfo(MarketAppInfo marketAppInfo) {
            this.marketAppInfo = marketAppInfo;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder msParameter(String str) {
            this.msParameter = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder network(String str) {
            this.network = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder networkCode(String str) {
            this.networkCode = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder oAuthToken(String str) {
            this.oAuthToken = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder omidAdSessionsOnStartedOnly(Boolean bool) {
            this.omidAdSessionsOnStartedOnly = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder pauseAdSlot(String str) {
            this.pauseAdSlot = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder pixelDensity(Double d) {
            this.pixelDensity = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder platformSignals(Map<String, String> map) {
            l8f a;
            if (map == null) {
                a = null;
            } else {
                a = l8f.a(map);
            }
            this.platformSignals = a;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder preferredLinearOrientation(Integer num) {
            this.preferredLinearOrientation = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder projectNumber(String str) {
            this.projectNumber = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder region(String str) {
            this.region = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder rubidiumApiVersion(int i) {
            this.rubidiumApiVersion = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder secureSignals(List<SecureSignalsData> list) {
            a8f i;
            if (list == null) {
                i = null;
            } else {
                i = a8f.i(list);
            }
            this.secureSignals = i;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder settings(ImaSdkSettingsData imaSdkSettingsData) {
            this.settings = imaSdkSettingsData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder streamActivityMonitorId(String str) {
            this.streamActivityMonitorId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsExternalNavigation(Boolean bool) {
            this.supportsExternalNavigation = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsIconClickFallback(Boolean bool) {
            this.supportsIconClickFallback = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsNativeClickSignals(Boolean bool) {
            this.supportsNativeClickSignals = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsNativeNetworking(Boolean bool) {
            this.supportsNativeNetworking = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsNativeViewSignals(Boolean bool) {
            this.supportsNativeViewSignals = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsOmidJsManagedAppSessions(Boolean bool) {
            this.supportsOmidJsManagedAppSessions = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsQuicksilver(Boolean bool) {
            this.supportsQuicksilver = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsResizing(Boolean bool) {
            this.supportsResizing = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder useQAStreamBaseUrl(Boolean bool) {
            this.useQAStreamBaseUrl = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder usesCustomVideoPlayback(Boolean bool) {
            this.usesCustomVideoPlayback = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder vastLoadTimeout(Float f) {
            this.vastLoadTimeout = f;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoContinuousPlay(AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState) {
            this.videoContinuousPlay = adsRequestImpl$ContinuousPlayState;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoEnvironment(VideoEnvironmentData videoEnvironmentData) {
            this.videoEnvironment = videoEnvironmentData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoId(String str) {
            this.videoId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoPlayActivation(AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState) {
            this.videoPlayActivation = adsRequestImpl$AutoPlayState;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoPlayMuted(AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState) {
            this.videoPlayMuted = adsRequestImpl$MutePlayState;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoStitcherSessionOptions(Map<String, Object> map) {
            l8f a;
            if (map == null) {
                a = null;
            } else {
                a = l8f.a(map);
            }
            this.videoStitcherSessionOptions = a;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder vodConfigId(String str) {
            this.vodConfigId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder wrappedCompanionsEnabled(Boolean bool) {
            this.wrappedCompanionsEnabled = bool;
            return this;
        }
    }

    private AutoValue_GsonAdsRequest(l8f l8fVar, String str, String str2, String str3, String str4, String str5, l8f l8fVar2, Float f, a8f a8fVar, String str6, String str7, String str8, String str9, l8f l8fVar3, String str10, Integer num, Boolean bool, String str11, a8f a8fVar2, String str12, IdentifierInfo identifierInfo, Boolean bool2, Boolean bool3, String str13, Boolean bool4, Integer num2, Integer num3, String str14, Float f2, MarketAppInfo marketAppInfo, String str15, String str16, VideoEnvironmentData videoEnvironmentData, String str17, String str18, Boolean bool5, Double d, l8f l8fVar4, Integer num4, String str19, String str20, ImaSdkSettingsData imaSdkSettingsData, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str21, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Float f3, String str22, AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState, AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState, AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState, l8f l8fVar5, String str23, CustomUiOptionsData customUiOptionsData, int i) {
        this.adTagParameters = l8fVar;
        this.adTagUrl = str;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = l8fVar2;
        this.contentDuration = f;
        this.contentKeywords = a8fVar;
        this.contentSourceUrl = str6;
        this.contentTitle = str7;
        this.contentUrl = str8;
        this.contentSourceId = str9;
        this.consentSettings = l8fVar3;
        this.customAssetKey = str10;
        this.daiIntegration = num;
        this.enableNonce = bool;
        this.env = str11;
        this.secureSignals = a8fVar2;
        this.format = str12;
        this.identifierInfo = identifierInfo;
        this.isTv = bool2;
        this.isAndroidTvAdsFramework = bool3;
        this.pauseAdSlot = str13;
        this.wrappedCompanionsEnabled = bool4;
        this.linearAdSlotWidth = num2;
        this.linearAdSlotHeight = num3;
        this.liveStreamEventId = str14;
        this.liveStreamPrefetchSeconds = f2;
        this.marketAppInfo = marketAppInfo;
        this.msParameter = str15;
        this.network = str16;
        this.videoEnvironment = videoEnvironmentData;
        this.networkCode = str17;
        this.oAuthToken = str18;
        this.omidAdSessionsOnStartedOnly = bool5;
        this.pixelDensity = d;
        this.platformSignals = l8fVar4;
        this.preferredLinearOrientation = num4;
        this.projectNumber = str19;
        this.region = str20;
        this.settings = imaSdkSettingsData;
        this.supportsExternalNavigation = bool6;
        this.supportsIconClickFallback = bool7;
        this.supportsNativeClickSignals = bool8;
        this.supportsNativeNetworking = bool9;
        this.supportsNativeViewSignals = bool10;
        this.supportsOmidJsManagedAppSessions = bool11;
        this.streamActivityMonitorId = str21;
        this.supportsQuicksilver = bool12;
        this.supportsResizing = bool13;
        this.useQAStreamBaseUrl = bool14;
        this.usesCustomVideoPlayback = bool15;
        this.vastLoadTimeout = f3;
        this.videoId = str22;
        this.videoPlayActivation = adsRequestImpl$AutoPlayState;
        this.videoContinuousPlay = adsRequestImpl$ContinuousPlayState;
        this.videoPlayMuted = adsRequestImpl$MutePlayState;
        this.videoStitcherSessionOptions = l8fVar5;
        this.vodConfigId = str23;
        this.customUiOptions = customUiOptionsData;
        this.rubidiumApiVersion = i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public l8f adTagParameters() {
        return this.adTagParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String adTagUrl() {
        return this.adTagUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String adsResponse() {
        return this.adsResponse;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String apiKey() {
        return this.apiKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String assetKey() {
        return this.assetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String authToken() {
        return this.authToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public l8f companionSlots() {
        return this.companionSlots;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public l8f consentSettings() {
        return this.consentSettings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Float contentDuration() {
        return this.contentDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public a8f contentKeywords() {
        return this.contentKeywords;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String contentSourceId() {
        return this.contentSourceId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String contentSourceUrl() {
        return this.contentSourceUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String contentTitle() {
        return this.contentTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String contentUrl() {
        return this.contentUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String customAssetKey() {
        return this.customAssetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public CustomUiOptionsData customUiOptions() {
        return this.customUiOptions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Integer daiIntegration() {
        return this.daiIntegration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean enableNonce() {
        return this.enableNonce;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GsonAdsRequest) {
            GsonAdsRequest gsonAdsRequest = (GsonAdsRequest) obj;
            l8f l8fVar = this.adTagParameters;
            if (l8fVar != null ? l8fVar.equals(gsonAdsRequest.adTagParameters()) : gsonAdsRequest.adTagParameters() == null) {
                String str = this.adTagUrl;
                if (str != null ? str.equals(gsonAdsRequest.adTagUrl()) : gsonAdsRequest.adTagUrl() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(gsonAdsRequest.adsResponse()) : gsonAdsRequest.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(gsonAdsRequest.apiKey()) : gsonAdsRequest.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(gsonAdsRequest.assetKey()) : gsonAdsRequest.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(gsonAdsRequest.authToken()) : gsonAdsRequest.authToken() == null) {
                                    l8f l8fVar2 = this.companionSlots;
                                    if (l8fVar2 != null ? l8fVar2.equals(gsonAdsRequest.companionSlots()) : gsonAdsRequest.companionSlots() == null) {
                                        Float f = this.contentDuration;
                                        if (f != null ? f.equals(gsonAdsRequest.contentDuration()) : gsonAdsRequest.contentDuration() == null) {
                                            a8f a8fVar = this.contentKeywords;
                                            if (a8fVar != null ? a8fVar.equals(gsonAdsRequest.contentKeywords()) : gsonAdsRequest.contentKeywords() == null) {
                                                String str6 = this.contentSourceUrl;
                                                if (str6 != null ? str6.equals(gsonAdsRequest.contentSourceUrl()) : gsonAdsRequest.contentSourceUrl() == null) {
                                                    String str7 = this.contentTitle;
                                                    if (str7 != null ? str7.equals(gsonAdsRequest.contentTitle()) : gsonAdsRequest.contentTitle() == null) {
                                                        String str8 = this.contentUrl;
                                                        if (str8 != null ? str8.equals(gsonAdsRequest.contentUrl()) : gsonAdsRequest.contentUrl() == null) {
                                                            String str9 = this.contentSourceId;
                                                            if (str9 != null ? str9.equals(gsonAdsRequest.contentSourceId()) : gsonAdsRequest.contentSourceId() == null) {
                                                                l8f l8fVar3 = this.consentSettings;
                                                                if (l8fVar3 != null ? l8fVar3.equals(gsonAdsRequest.consentSettings()) : gsonAdsRequest.consentSettings() == null) {
                                                                    String str10 = this.customAssetKey;
                                                                    if (str10 != null ? str10.equals(gsonAdsRequest.customAssetKey()) : gsonAdsRequest.customAssetKey() == null) {
                                                                        Integer num = this.daiIntegration;
                                                                        if (num != null ? num.equals(gsonAdsRequest.daiIntegration()) : gsonAdsRequest.daiIntegration() == null) {
                                                                            Boolean bool = this.enableNonce;
                                                                            if (bool != null ? bool.equals(gsonAdsRequest.enableNonce()) : gsonAdsRequest.enableNonce() == null) {
                                                                                String str11 = this.env;
                                                                                if (str11 != null ? str11.equals(gsonAdsRequest.env()) : gsonAdsRequest.env() == null) {
                                                                                    a8f a8fVar2 = this.secureSignals;
                                                                                    if (a8fVar2 != null ? a8fVar2.equals(gsonAdsRequest.secureSignals()) : gsonAdsRequest.secureSignals() == null) {
                                                                                        String str12 = this.format;
                                                                                        if (str12 != null ? str12.equals(gsonAdsRequest.format()) : gsonAdsRequest.format() == null) {
                                                                                            IdentifierInfo identifierInfo = this.identifierInfo;
                                                                                            if (identifierInfo != null ? identifierInfo.equals(gsonAdsRequest.identifierInfo()) : gsonAdsRequest.identifierInfo() == null) {
                                                                                                Boolean bool2 = this.isTv;
                                                                                                if (bool2 != null ? bool2.equals(gsonAdsRequest.isTv()) : gsonAdsRequest.isTv() == null) {
                                                                                                    Boolean bool3 = this.isAndroidTvAdsFramework;
                                                                                                    if (bool3 != null ? bool3.equals(gsonAdsRequest.isAndroidTvAdsFramework()) : gsonAdsRequest.isAndroidTvAdsFramework() == null) {
                                                                                                        String str13 = this.pauseAdSlot;
                                                                                                        if (str13 != null ? str13.equals(gsonAdsRequest.pauseAdSlot()) : gsonAdsRequest.pauseAdSlot() == null) {
                                                                                                            Boolean bool4 = this.wrappedCompanionsEnabled;
                                                                                                            if (bool4 != null ? bool4.equals(gsonAdsRequest.wrappedCompanionsEnabled()) : gsonAdsRequest.wrappedCompanionsEnabled() == null) {
                                                                                                                Integer num2 = this.linearAdSlotWidth;
                                                                                                                if (num2 != null ? num2.equals(gsonAdsRequest.linearAdSlotWidth()) : gsonAdsRequest.linearAdSlotWidth() == null) {
                                                                                                                    Integer num3 = this.linearAdSlotHeight;
                                                                                                                    if (num3 != null ? num3.equals(gsonAdsRequest.linearAdSlotHeight()) : gsonAdsRequest.linearAdSlotHeight() == null) {
                                                                                                                        String str14 = this.liveStreamEventId;
                                                                                                                        if (str14 != null ? str14.equals(gsonAdsRequest.liveStreamEventId()) : gsonAdsRequest.liveStreamEventId() == null) {
                                                                                                                            Float f2 = this.liveStreamPrefetchSeconds;
                                                                                                                            if (f2 != null ? f2.equals(gsonAdsRequest.liveStreamPrefetchSeconds()) : gsonAdsRequest.liveStreamPrefetchSeconds() == null) {
                                                                                                                                MarketAppInfo marketAppInfo = this.marketAppInfo;
                                                                                                                                if (marketAppInfo != null ? marketAppInfo.equals(gsonAdsRequest.marketAppInfo()) : gsonAdsRequest.marketAppInfo() == null) {
                                                                                                                                    String str15 = this.msParameter;
                                                                                                                                    if (str15 != null ? str15.equals(gsonAdsRequest.msParameter()) : gsonAdsRequest.msParameter() == null) {
                                                                                                                                        String str16 = this.network;
                                                                                                                                        if (str16 != null ? str16.equals(gsonAdsRequest.network()) : gsonAdsRequest.network() == null) {
                                                                                                                                            VideoEnvironmentData videoEnvironmentData = this.videoEnvironment;
                                                                                                                                            if (videoEnvironmentData != null ? videoEnvironmentData.equals(gsonAdsRequest.videoEnvironment()) : gsonAdsRequest.videoEnvironment() == null) {
                                                                                                                                                String str17 = this.networkCode;
                                                                                                                                                if (str17 != null ? str17.equals(gsonAdsRequest.networkCode()) : gsonAdsRequest.networkCode() == null) {
                                                                                                                                                    String str18 = this.oAuthToken;
                                                                                                                                                    if (str18 != null ? str18.equals(gsonAdsRequest.oAuthToken()) : gsonAdsRequest.oAuthToken() == null) {
                                                                                                                                                        Boolean bool5 = this.omidAdSessionsOnStartedOnly;
                                                                                                                                                        if (bool5 != null ? bool5.equals(gsonAdsRequest.omidAdSessionsOnStartedOnly()) : gsonAdsRequest.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                                                            Double d = this.pixelDensity;
                                                                                                                                                            if (d != null ? d.equals(gsonAdsRequest.pixelDensity()) : gsonAdsRequest.pixelDensity() == null) {
                                                                                                                                                                l8f l8fVar4 = this.platformSignals;
                                                                                                                                                                if (l8fVar4 != null ? l8fVar4.equals(gsonAdsRequest.platformSignals()) : gsonAdsRequest.platformSignals() == null) {
                                                                                                                                                                    Integer num4 = this.preferredLinearOrientation;
                                                                                                                                                                    if (num4 != null ? num4.equals(gsonAdsRequest.preferredLinearOrientation()) : gsonAdsRequest.preferredLinearOrientation() == null) {
                                                                                                                                                                        String str19 = this.projectNumber;
                                                                                                                                                                        if (str19 != null ? str19.equals(gsonAdsRequest.projectNumber()) : gsonAdsRequest.projectNumber() == null) {
                                                                                                                                                                            String str20 = this.region;
                                                                                                                                                                            if (str20 != null ? str20.equals(gsonAdsRequest.region()) : gsonAdsRequest.region() == null) {
                                                                                                                                                                                ImaSdkSettingsData imaSdkSettingsData = this.settings;
                                                                                                                                                                                if (imaSdkSettingsData != null ? imaSdkSettingsData.equals(gsonAdsRequest.settings()) : gsonAdsRequest.settings() == null) {
                                                                                                                                                                                    Boolean bool6 = this.supportsExternalNavigation;
                                                                                                                                                                                    if (bool6 != null ? bool6.equals(gsonAdsRequest.supportsExternalNavigation()) : gsonAdsRequest.supportsExternalNavigation() == null) {
                                                                                                                                                                                        Boolean bool7 = this.supportsIconClickFallback;
                                                                                                                                                                                        if (bool7 != null ? bool7.equals(gsonAdsRequest.supportsIconClickFallback()) : gsonAdsRequest.supportsIconClickFallback() == null) {
                                                                                                                                                                                            Boolean bool8 = this.supportsNativeClickSignals;
                                                                                                                                                                                            if (bool8 != null ? bool8.equals(gsonAdsRequest.supportsNativeClickSignals()) : gsonAdsRequest.supportsNativeClickSignals() == null) {
                                                                                                                                                                                                Boolean bool9 = this.supportsNativeNetworking;
                                                                                                                                                                                                if (bool9 != null ? bool9.equals(gsonAdsRequest.supportsNativeNetworking()) : gsonAdsRequest.supportsNativeNetworking() == null) {
                                                                                                                                                                                                    Boolean bool10 = this.supportsNativeViewSignals;
                                                                                                                                                                                                    if (bool10 != null ? bool10.equals(gsonAdsRequest.supportsNativeViewSignals()) : gsonAdsRequest.supportsNativeViewSignals() == null) {
                                                                                                                                                                                                        Boolean bool11 = this.supportsOmidJsManagedAppSessions;
                                                                                                                                                                                                        if (bool11 != null ? bool11.equals(gsonAdsRequest.supportsOmidJsManagedAppSessions()) : gsonAdsRequest.supportsOmidJsManagedAppSessions() == null) {
                                                                                                                                                                                                            String str21 = this.streamActivityMonitorId;
                                                                                                                                                                                                            if (str21 != null ? str21.equals(gsonAdsRequest.streamActivityMonitorId()) : gsonAdsRequest.streamActivityMonitorId() == null) {
                                                                                                                                                                                                                Boolean bool12 = this.supportsQuicksilver;
                                                                                                                                                                                                                if (bool12 != null ? bool12.equals(gsonAdsRequest.supportsQuicksilver()) : gsonAdsRequest.supportsQuicksilver() == null) {
                                                                                                                                                                                                                    Boolean bool13 = this.supportsResizing;
                                                                                                                                                                                                                    if (bool13 != null ? bool13.equals(gsonAdsRequest.supportsResizing()) : gsonAdsRequest.supportsResizing() == null) {
                                                                                                                                                                                                                        Boolean bool14 = this.useQAStreamBaseUrl;
                                                                                                                                                                                                                        if (bool14 != null ? bool14.equals(gsonAdsRequest.useQAStreamBaseUrl()) : gsonAdsRequest.useQAStreamBaseUrl() == null) {
                                                                                                                                                                                                                            Boolean bool15 = this.usesCustomVideoPlayback;
                                                                                                                                                                                                                            if (bool15 != null ? bool15.equals(gsonAdsRequest.usesCustomVideoPlayback()) : gsonAdsRequest.usesCustomVideoPlayback() == null) {
                                                                                                                                                                                                                                Float f3 = this.vastLoadTimeout;
                                                                                                                                                                                                                                if (f3 != null ? f3.equals(gsonAdsRequest.vastLoadTimeout()) : gsonAdsRequest.vastLoadTimeout() == null) {
                                                                                                                                                                                                                                    String str22 = this.videoId;
                                                                                                                                                                                                                                    if (str22 != null ? str22.equals(gsonAdsRequest.videoId()) : gsonAdsRequest.videoId() == null) {
                                                                                                                                                                                                                                        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = this.videoPlayActivation;
                                                                                                                                                                                                                                        if (adsRequestImpl$AutoPlayState != null ? adsRequestImpl$AutoPlayState.equals(gsonAdsRequest.videoPlayActivation()) : gsonAdsRequest.videoPlayActivation() == null) {
                                                                                                                                                                                                                                            AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState = this.videoContinuousPlay;
                                                                                                                                                                                                                                            if (adsRequestImpl$ContinuousPlayState != null ? adsRequestImpl$ContinuousPlayState.equals(gsonAdsRequest.videoContinuousPlay()) : gsonAdsRequest.videoContinuousPlay() == null) {
                                                                                                                                                                                                                                                AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = this.videoPlayMuted;
                                                                                                                                                                                                                                                if (adsRequestImpl$MutePlayState != null ? adsRequestImpl$MutePlayState.equals(gsonAdsRequest.videoPlayMuted()) : gsonAdsRequest.videoPlayMuted() == null) {
                                                                                                                                                                                                                                                    l8f l8fVar5 = this.videoStitcherSessionOptions;
                                                                                                                                                                                                                                                    if (l8fVar5 != null ? l8fVar5.equals(gsonAdsRequest.videoStitcherSessionOptions()) : gsonAdsRequest.videoStitcherSessionOptions() == null) {
                                                                                                                                                                                                                                                        String str23 = this.vodConfigId;
                                                                                                                                                                                                                                                        if (str23 != null ? str23.equals(gsonAdsRequest.vodConfigId()) : gsonAdsRequest.vodConfigId() == null) {
                                                                                                                                                                                                                                                            CustomUiOptionsData customUiOptionsData = this.customUiOptions;
                                                                                                                                                                                                                                                            if (customUiOptionsData != null ? customUiOptionsData.equals(gsonAdsRequest.customUiOptions()) : gsonAdsRequest.customUiOptions() == null) {
                                                                                                                                                                                                                                                                if (this.rubidiumApiVersion == gsonAdsRequest.rubidiumApiVersion()) {
                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String format() {
        return this.format;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        int hashCode47;
        int hashCode48;
        int hashCode49;
        int hashCode50;
        int hashCode51;
        int hashCode52;
        int hashCode53;
        int hashCode54;
        int hashCode55;
        int hashCode56;
        int hashCode57;
        int hashCode58;
        int hashCode59;
        int hashCode60;
        l8f l8fVar = this.adTagParameters;
        int i = 0;
        if (l8fVar == null) {
            hashCode = 0;
        } else {
            hashCode = l8fVar.hashCode();
        }
        String str = this.adTagUrl;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str2 = this.adsResponse;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str3 = this.apiKey;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str4 = this.assetKey;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        String str5 = this.authToken;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        l8f l8fVar2 = this.companionSlots;
        if (l8fVar2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l8fVar2.hashCode();
        }
        int i7 = (i6 ^ hashCode7) * 1000003;
        Float f = this.contentDuration;
        if (f == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = f.hashCode();
        }
        int i8 = (i7 ^ hashCode8) * 1000003;
        a8f a8fVar = this.contentKeywords;
        if (a8fVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = a8fVar.hashCode();
        }
        int i9 = (i8 ^ hashCode9) * 1000003;
        String str6 = this.contentSourceUrl;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i10 = (i9 ^ hashCode10) * 1000003;
        String str7 = this.contentTitle;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i11 = (i10 ^ hashCode11) * 1000003;
        String str8 = this.contentUrl;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i12 = (i11 ^ hashCode12) * 1000003;
        String str9 = this.contentSourceId;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int i13 = (i12 ^ hashCode13) * 1000003;
        l8f l8fVar3 = this.consentSettings;
        if (l8fVar3 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l8fVar3.hashCode();
        }
        int i14 = (i13 ^ hashCode14) * 1000003;
        String str10 = this.customAssetKey;
        if (str10 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str10.hashCode();
        }
        int i15 = (i14 ^ hashCode15) * 1000003;
        Integer num = this.daiIntegration;
        if (num == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num.hashCode();
        }
        int i16 = (i15 ^ hashCode16) * 1000003;
        Boolean bool = this.enableNonce;
        if (bool == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = bool.hashCode();
        }
        int i17 = (i16 ^ hashCode17) * 1000003;
        String str11 = this.env;
        if (str11 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str11.hashCode();
        }
        int i18 = (i17 ^ hashCode18) * 1000003;
        a8f a8fVar2 = this.secureSignals;
        if (a8fVar2 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = a8fVar2.hashCode();
        }
        int i19 = (i18 ^ hashCode19) * 1000003;
        String str12 = this.format;
        if (str12 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str12.hashCode();
        }
        int i20 = (i19 ^ hashCode20) * 1000003;
        IdentifierInfo identifierInfo = this.identifierInfo;
        if (identifierInfo == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = identifierInfo.hashCode();
        }
        int i21 = (i20 ^ hashCode21) * 1000003;
        Boolean bool2 = this.isTv;
        if (bool2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = bool2.hashCode();
        }
        int i22 = (i21 ^ hashCode22) * 1000003;
        Boolean bool3 = this.isAndroidTvAdsFramework;
        if (bool3 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = bool3.hashCode();
        }
        int i23 = (i22 ^ hashCode23) * 1000003;
        String str13 = this.pauseAdSlot;
        if (str13 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str13.hashCode();
        }
        int i24 = (i23 ^ hashCode24) * 1000003;
        Boolean bool4 = this.wrappedCompanionsEnabled;
        if (bool4 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = bool4.hashCode();
        }
        int i25 = (i24 ^ hashCode25) * 1000003;
        Integer num2 = this.linearAdSlotWidth;
        if (num2 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = num2.hashCode();
        }
        int i26 = (i25 ^ hashCode26) * 1000003;
        Integer num3 = this.linearAdSlotHeight;
        if (num3 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = num3.hashCode();
        }
        int i27 = (i26 ^ hashCode27) * 1000003;
        String str14 = this.liveStreamEventId;
        if (str14 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = str14.hashCode();
        }
        int i28 = (i27 ^ hashCode28) * 1000003;
        Float f2 = this.liveStreamPrefetchSeconds;
        if (f2 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = f2.hashCode();
        }
        int i29 = (i28 ^ hashCode29) * 1000003;
        MarketAppInfo marketAppInfo = this.marketAppInfo;
        if (marketAppInfo == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = marketAppInfo.hashCode();
        }
        int i30 = (i29 ^ hashCode30) * 1000003;
        String str15 = this.msParameter;
        if (str15 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = str15.hashCode();
        }
        int i31 = (i30 ^ hashCode31) * 1000003;
        String str16 = this.network;
        if (str16 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = str16.hashCode();
        }
        int i32 = (i31 ^ hashCode32) * 1000003;
        VideoEnvironmentData videoEnvironmentData = this.videoEnvironment;
        if (videoEnvironmentData == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = videoEnvironmentData.hashCode();
        }
        int i33 = (i32 ^ hashCode33) * 1000003;
        String str17 = this.networkCode;
        if (str17 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = str17.hashCode();
        }
        int i34 = (i33 ^ hashCode34) * 1000003;
        String str18 = this.oAuthToken;
        if (str18 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = str18.hashCode();
        }
        int i35 = (i34 ^ hashCode35) * 1000003;
        Boolean bool5 = this.omidAdSessionsOnStartedOnly;
        if (bool5 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = bool5.hashCode();
        }
        int i36 = (i35 ^ hashCode36) * 1000003;
        Double d = this.pixelDensity;
        if (d == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = d.hashCode();
        }
        int i37 = (i36 ^ hashCode37) * 1000003;
        l8f l8fVar4 = this.platformSignals;
        if (l8fVar4 == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = l8fVar4.hashCode();
        }
        int i38 = (i37 ^ hashCode38) * 1000003;
        Integer num4 = this.preferredLinearOrientation;
        if (num4 == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = num4.hashCode();
        }
        int i39 = (i38 ^ hashCode39) * 1000003;
        String str19 = this.projectNumber;
        if (str19 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = str19.hashCode();
        }
        int i40 = (i39 ^ hashCode40) * 1000003;
        String str20 = this.region;
        if (str20 == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = str20.hashCode();
        }
        int i41 = (i40 ^ hashCode41) * 1000003;
        ImaSdkSettingsData imaSdkSettingsData = this.settings;
        if (imaSdkSettingsData == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = imaSdkSettingsData.hashCode();
        }
        int i42 = (i41 ^ hashCode42) * 1000003;
        Boolean bool6 = this.supportsExternalNavigation;
        if (bool6 == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = bool6.hashCode();
        }
        int i43 = (i42 ^ hashCode43) * 1000003;
        Boolean bool7 = this.supportsIconClickFallback;
        if (bool7 == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = bool7.hashCode();
        }
        int i44 = (i43 ^ hashCode44) * 1000003;
        Boolean bool8 = this.supportsNativeClickSignals;
        if (bool8 == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = bool8.hashCode();
        }
        int i45 = (i44 ^ hashCode45) * 1000003;
        Boolean bool9 = this.supportsNativeNetworking;
        if (bool9 == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = bool9.hashCode();
        }
        int i46 = (i45 ^ hashCode46) * 1000003;
        Boolean bool10 = this.supportsNativeViewSignals;
        if (bool10 == null) {
            hashCode47 = 0;
        } else {
            hashCode47 = bool10.hashCode();
        }
        int i47 = (i46 ^ hashCode47) * 1000003;
        Boolean bool11 = this.supportsOmidJsManagedAppSessions;
        if (bool11 == null) {
            hashCode48 = 0;
        } else {
            hashCode48 = bool11.hashCode();
        }
        int i48 = (i47 ^ hashCode48) * 1000003;
        String str21 = this.streamActivityMonitorId;
        if (str21 == null) {
            hashCode49 = 0;
        } else {
            hashCode49 = str21.hashCode();
        }
        int i49 = (i48 ^ hashCode49) * 1000003;
        Boolean bool12 = this.supportsQuicksilver;
        if (bool12 == null) {
            hashCode50 = 0;
        } else {
            hashCode50 = bool12.hashCode();
        }
        int i50 = (i49 ^ hashCode50) * 1000003;
        Boolean bool13 = this.supportsResizing;
        if (bool13 == null) {
            hashCode51 = 0;
        } else {
            hashCode51 = bool13.hashCode();
        }
        int i51 = (i50 ^ hashCode51) * 1000003;
        Boolean bool14 = this.useQAStreamBaseUrl;
        if (bool14 == null) {
            hashCode52 = 0;
        } else {
            hashCode52 = bool14.hashCode();
        }
        int i52 = (i51 ^ hashCode52) * 1000003;
        Boolean bool15 = this.usesCustomVideoPlayback;
        if (bool15 == null) {
            hashCode53 = 0;
        } else {
            hashCode53 = bool15.hashCode();
        }
        int i53 = (i52 ^ hashCode53) * 1000003;
        Float f3 = this.vastLoadTimeout;
        if (f3 == null) {
            hashCode54 = 0;
        } else {
            hashCode54 = f3.hashCode();
        }
        int i54 = (i53 ^ hashCode54) * 1000003;
        String str22 = this.videoId;
        if (str22 == null) {
            hashCode55 = 0;
        } else {
            hashCode55 = str22.hashCode();
        }
        int i55 = (i54 ^ hashCode55) * 1000003;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = this.videoPlayActivation;
        if (adsRequestImpl$AutoPlayState == null) {
            hashCode56 = 0;
        } else {
            hashCode56 = adsRequestImpl$AutoPlayState.hashCode();
        }
        int i56 = (i55 ^ hashCode56) * 1000003;
        AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState = this.videoContinuousPlay;
        if (adsRequestImpl$ContinuousPlayState == null) {
            hashCode57 = 0;
        } else {
            hashCode57 = adsRequestImpl$ContinuousPlayState.hashCode();
        }
        int i57 = (i56 ^ hashCode57) * 1000003;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = this.videoPlayMuted;
        if (adsRequestImpl$MutePlayState == null) {
            hashCode58 = 0;
        } else {
            hashCode58 = adsRequestImpl$MutePlayState.hashCode();
        }
        int i58 = (i57 ^ hashCode58) * 1000003;
        l8f l8fVar5 = this.videoStitcherSessionOptions;
        if (l8fVar5 == null) {
            hashCode59 = 0;
        } else {
            hashCode59 = l8fVar5.hashCode();
        }
        int i59 = (i58 ^ hashCode59) * 1000003;
        String str23 = this.vodConfigId;
        if (str23 == null) {
            hashCode60 = 0;
        } else {
            hashCode60 = str23.hashCode();
        }
        int i60 = (i59 ^ hashCode60) * 1000003;
        CustomUiOptionsData customUiOptionsData = this.customUiOptions;
        if (customUiOptionsData != null) {
            i = customUiOptionsData.hashCode();
        }
        return this.rubidiumApiVersion ^ ((i60 ^ i) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public IdentifierInfo identifierInfo() {
        return this.identifierInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean isAndroidTvAdsFramework() {
        return this.isAndroidTvAdsFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean isTv() {
        return this.isTv;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String liveStreamEventId() {
        return this.liveStreamEventId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public MarketAppInfo marketAppInfo() {
        return this.marketAppInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String msParameter() {
        return this.msParameter;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String network() {
        return this.network;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String networkCode() {
        return this.networkCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String oAuthToken() {
        return this.oAuthToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String pauseAdSlot() {
        return this.pauseAdSlot;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Double pixelDensity() {
        return this.pixelDensity;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public l8f platformSignals() {
        return this.platformSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Integer preferredLinearOrientation() {
        return this.preferredLinearOrientation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String projectNumber() {
        return this.projectNumber;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String region() {
        return this.region;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public int rubidiumApiVersion() {
        return this.rubidiumApiVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public a8f secureSignals() {
        return this.secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public ImaSdkSettingsData settings() {
        return this.settings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean supportsNativeClickSignals() {
        return this.supportsNativeClickSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean supportsNativeNetworking() {
        return this.supportsNativeNetworking;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean supportsNativeViewSignals() {
        return this.supportsNativeViewSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean supportsOmidJsManagedAppSessions() {
        return this.supportsOmidJsManagedAppSessions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean supportsQuicksilver() {
        return this.supportsQuicksilver;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    public String toString() {
        CustomUiOptionsData customUiOptionsData = this.customUiOptions;
        l8f l8fVar = this.videoStitcherSessionOptions;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = this.videoPlayMuted;
        AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState = this.videoContinuousPlay;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = this.videoPlayActivation;
        ImaSdkSettingsData imaSdkSettingsData = this.settings;
        l8f l8fVar2 = this.platformSignals;
        VideoEnvironmentData videoEnvironmentData = this.videoEnvironment;
        MarketAppInfo marketAppInfo = this.marketAppInfo;
        IdentifierInfo identifierInfo = this.identifierInfo;
        a8f a8fVar = this.secureSignals;
        a8f a8fVar2 = this.contentKeywords;
        l8f l8fVar3 = this.companionSlots;
        String valueOf = String.valueOf(this.adTagParameters);
        String valueOf2 = String.valueOf(l8fVar3);
        String valueOf3 = String.valueOf(a8fVar2);
        String valueOf4 = String.valueOf(this.consentSettings);
        String valueOf5 = String.valueOf(a8fVar);
        String valueOf6 = String.valueOf(identifierInfo);
        String valueOf7 = String.valueOf(marketAppInfo);
        String valueOf8 = String.valueOf(videoEnvironmentData);
        String valueOf9 = String.valueOf(l8fVar2);
        String valueOf10 = String.valueOf(imaSdkSettingsData);
        String valueOf11 = String.valueOf(adsRequestImpl$AutoPlayState);
        String valueOf12 = String.valueOf(adsRequestImpl$ContinuousPlayState);
        String valueOf13 = String.valueOf(adsRequestImpl$MutePlayState);
        String valueOf14 = String.valueOf(l8fVar);
        String valueOf15 = String.valueOf(customUiOptionsData);
        int length = valueOf.length();
        String str = this.adTagUrl;
        int length2 = String.valueOf(str).length();
        String str2 = this.adsResponse;
        int length3 = String.valueOf(str2).length();
        String str3 = this.apiKey;
        int length4 = String.valueOf(str3).length();
        String str4 = this.assetKey;
        int length5 = String.valueOf(str4).length();
        String str5 = this.authToken;
        int length6 = String.valueOf(str5).length();
        int length7 = valueOf2.length();
        Float f = this.contentDuration;
        String valueOf16 = String.valueOf(f);
        Integer num = this.linearAdSlotWidth;
        String str6 = this.contentTitle;
        String str7 = this.contentSourceUrl;
        String str8 = this.contentUrl;
        String str9 = this.contentSourceId;
        String str10 = this.customAssetKey;
        Integer num2 = this.daiIntegration;
        Boolean bool = this.enableNonce;
        String str11 = this.env;
        String str12 = this.format;
        Boolean bool2 = this.isTv;
        Boolean bool3 = this.isAndroidTvAdsFramework;
        String str13 = this.pauseAdSlot;
        Boolean bool4 = this.wrappedCompanionsEnabled;
        Integer num3 = this.linearAdSlotHeight;
        int length8 = valueOf16.length();
        int length9 = valueOf3.length();
        int length10 = String.valueOf(str7).length();
        int length11 = String.valueOf(str6).length();
        int length12 = String.valueOf(str8).length();
        int length13 = String.valueOf(str9).length();
        int length14 = valueOf4.length();
        int length15 = String.valueOf(str10).length();
        int length16 = String.valueOf(num2).length();
        int length17 = String.valueOf(bool).length();
        int length18 = String.valueOf(str11).length();
        int length19 = valueOf5.length();
        int length20 = String.valueOf(str12).length();
        int length21 = valueOf6.length();
        int length22 = String.valueOf(bool2).length();
        int length23 = String.valueOf(bool3).length();
        int length24 = String.valueOf(str13).length();
        int length25 = String.valueOf(bool4).length();
        int length26 = String.valueOf(num).length();
        Boolean bool5 = this.usesCustomVideoPlayback;
        Boolean bool6 = this.useQAStreamBaseUrl;
        Boolean bool7 = this.supportsResizing;
        Boolean bool8 = this.supportsQuicksilver;
        String str14 = this.streamActivityMonitorId;
        Boolean bool9 = this.supportsOmidJsManagedAppSessions;
        Boolean bool10 = this.supportsNativeViewSignals;
        Boolean bool11 = this.supportsNativeNetworking;
        Boolean bool12 = this.supportsNativeClickSignals;
        Boolean bool13 = this.supportsIconClickFallback;
        Boolean bool14 = this.supportsExternalNavigation;
        String str15 = this.region;
        String str16 = this.projectNumber;
        Integer num4 = this.preferredLinearOrientation;
        Double d = this.pixelDensity;
        Boolean bool15 = this.omidAdSessionsOnStartedOnly;
        String str17 = this.oAuthToken;
        String str18 = this.networkCode;
        String str19 = this.network;
        String str20 = this.msParameter;
        Float f2 = this.liveStreamPrefetchSeconds;
        String str21 = this.liveStreamEventId;
        int length27 = String.valueOf(num3).length();
        int a = s21.a(s21.a(length + 42 + length2 + 14 + length3 + 9 + length4 + 11 + length5 + 12 + length6 + 17 + length7 + 18 + length8 + 18 + length9 + 19 + length10 + 15 + length11 + 13 + length12 + 18 + length13 + 18 + length14 + 17 + length15 + 17 + length16 + 14 + length17 + 6 + length18 + 16 + length19 + 9 + length20 + 17 + length21 + 7 + length22 + 26 + length23 + 14 + length24 + 27 + length25 + 20 + length26 + 21 + length27 + 20 + String.valueOf(str21).length() + 28, 16, String.valueOf(f2)), 14, valueOf7);
        int length28 = String.valueOf(str20).length();
        int a2 = s21.a(s21.a(a + length28 + 10, 19, String.valueOf(str19)), 14, valueOf8);
        int length29 = String.valueOf(str18).length();
        int length30 = String.valueOf(str17).length();
        int a3 = s21.a(a2 + length29 + 13 + length30 + 30 + String.valueOf(bool15).length() + 15, 18, String.valueOf(d));
        int length31 = valueOf9.length();
        int length32 = String.valueOf(str15).length() + s21.a(a3 + length31 + 29 + String.valueOf(num4).length() + 16, 9, String.valueOf(str16)) + 11;
        int length33 = valueOf10.length();
        int length34 = String.valueOf(bool14).length();
        int length35 = String.valueOf(bool13).length();
        int length36 = String.valueOf(bool12).length();
        int length37 = String.valueOf(bool11).length();
        int length38 = String.valueOf(bool10).length();
        int length39 = String.valueOf(bool9).length();
        int length40 = String.valueOf(str14).length();
        int length41 = String.valueOf(bool8).length();
        int length42 = String.valueOf(bool7).length();
        int length43 = String.valueOf(bool6).length();
        String valueOf17 = String.valueOf(bool5);
        int i = this.rubidiumApiVersion;
        String str22 = this.vodConfigId;
        String str23 = this.videoId;
        Float f3 = this.vastLoadTimeout;
        int a4 = s21.a(length32 + length33 + 29 + length34 + 28 + length35 + 29 + length36 + 27 + length37 + 28 + length38 + 35 + length39 + 26 + length40 + 22 + length41 + 19 + length42 + 21 + length43 + 26, 18, valueOf17);
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + s21.a(String.valueOf(str22).length() + s21.a(s21.a(s21.a(s21.a(String.valueOf(str23).length() + String.valueOf(f3).length() + a4 + 10 + 22, 22, valueOf11), 17, valueOf12), 30, valueOf13), 14, valueOf14) + 18, 21, valueOf15) + 1);
        nk2.C(sb, "GsonAdsRequest{adTagParameters=", valueOf, ", adTagUrl=", str);
        nk2.C(sb, ", adsResponse=", str2, ", apiKey=", str3);
        nk2.C(sb, ", assetKey=", str4, ", authToken=", str5);
        sb.append(", companionSlots=");
        sb.append(valueOf2);
        sb.append(", contentDuration=");
        sb.append(f);
        nk2.C(sb, ", contentKeywords=", valueOf3, ", contentSourceUrl=", str7);
        nk2.C(sb, ", contentTitle=", str6, ", contentUrl=", str8);
        nk2.C(sb, ", contentSourceId=", str9, ", consentSettings=", valueOf4);
        sb.append(", customAssetKey=");
        sb.append(str10);
        sb.append(", daiIntegration=");
        sb.append(num2);
        sb.append(", enableNonce=");
        sb.append(bool);
        sb.append(", env=");
        sb.append(str11);
        nk2.C(sb, ", secureSignals=", valueOf5, ", format=", str12);
        sb.append(", identifierInfo=");
        sb.append(valueOf6);
        sb.append(", isTv=");
        sb.append(bool2);
        sb.append(", isAndroidTvAdsFramework=");
        sb.append(bool3);
        sb.append(", pauseAdSlot=");
        sb.append(str13);
        sb.append(", wrappedCompanionsEnabled=");
        sb.append(bool4);
        sb.append(", linearAdSlotWidth=");
        sb.append(num);
        sb.append(", linearAdSlotHeight=");
        sb.append(num3);
        sb.append(", liveStreamEventId=");
        sb.append(str21);
        sb.append(", liveStreamPrefetchSeconds=");
        sb.append(f2);
        sb.append(", marketAppInfo=");
        sb.append(valueOf7);
        nk2.C(sb, ", msParameter=", str20, ", network=", str19);
        nk2.C(sb, ", videoEnvironment=", valueOf8, ", networkCode=", str18);
        sb.append(", oAuthToken=");
        sb.append(str17);
        sb.append(", omidAdSessionsOnStartedOnly=");
        sb.append(bool15);
        sb.append(", pixelDensity=");
        sb.append(d);
        sb.append(", platformSignals=");
        sb.append(valueOf9);
        sb.append(", preferredLinearOrientation=");
        sb.append(num4);
        sb.append(", projectNumber=");
        sb.append(str16);
        nk2.C(sb, ", region=", str15, ", settings=", valueOf10);
        sb.append(", supportsExternalNavigation=");
        sb.append(bool14);
        sb.append(", supportsIconClickFallback=");
        sb.append(bool13);
        sb.append(", supportsNativeClickSignals=");
        sb.append(bool12);
        sb.append(", supportsNativeNetworking=");
        sb.append(bool11);
        sb.append(", supportsNativeViewSignals=");
        sb.append(bool10);
        sb.append(", supportsOmidJsManagedAppSessions=");
        sb.append(bool9);
        sb.append(", streamActivityMonitorId=");
        sb.append(str14);
        sb.append(", supportsQuicksilver=");
        sb.append(bool8);
        sb.append(", supportsResizing=");
        sb.append(bool7);
        sb.append(", useQAStreamBaseUrl=");
        sb.append(bool6);
        sb.append(", usesCustomVideoPlayback=");
        sb.append(bool5);
        sb.append(", vastLoadTimeout=");
        sb.append(f3);
        nk2.C(sb, ", videoId=", str23, ", videoPlayActivation=", valueOf11);
        nk2.C(sb, ", videoContinuousPlay=", valueOf12, ", videoPlayMuted=", valueOf13);
        nk2.C(sb, ", videoStitcherSessionOptions=", valueOf14, ", vodConfigId=", str22);
        sb.append(", customUiOptions=");
        sb.append(valueOf15);
        sb.append(", rubidiumApiVersion=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public AdsRequestImpl$ContinuousPlayState videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public VideoEnvironmentData videoEnvironment() {
        return this.videoEnvironment;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String videoId() {
        return this.videoId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public AdsRequestImpl$AutoPlayState videoPlayActivation() {
        return this.videoPlayActivation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public AdsRequestImpl$MutePlayState videoPlayMuted() {
        return this.videoPlayMuted;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public l8f videoStitcherSessionOptions() {
        return this.videoStitcherSessionOptions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public String vodConfigId() {
        return this.vodConfigId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public Boolean wrappedCompanionsEnabled() {
        return this.wrappedCompanionsEnabled;
    }

    public /* synthetic */ AutoValue_GsonAdsRequest(l8f l8fVar, String str, String str2, String str3, String str4, String str5, l8f l8fVar2, Float f, a8f a8fVar, String str6, String str7, String str8, String str9, l8f l8fVar3, String str10, Integer num, Boolean bool, String str11, a8f a8fVar2, String str12, IdentifierInfo identifierInfo, Boolean bool2, Boolean bool3, String str13, Boolean bool4, Integer num2, Integer num3, String str14, Float f2, MarketAppInfo marketAppInfo, String str15, String str16, VideoEnvironmentData videoEnvironmentData, String str17, String str18, Boolean bool5, Double d, l8f l8fVar4, Integer num4, String str19, String str20, ImaSdkSettingsData imaSdkSettingsData, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str21, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Float f3, String str22, AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState, AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState, AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState, l8f l8fVar5, String str23, CustomUiOptionsData customUiOptionsData, int i, byte[] bArr) {
        this(l8fVar, str, str2, str3, str4, str5, l8fVar2, f, a8fVar, str6, str7, str8, str9, l8fVar3, str10, num, bool, str11, a8fVar2, str12, identifierInfo, bool2, bool3, str13, bool4, num2, num3, str14, f2, marketAppInfo, str15, str16, videoEnvironmentData, str17, str18, bool5, d, l8fVar4, num4, str19, str20, imaSdkSettingsData, bool6, bool7, bool8, bool9, bool10, bool11, str21, bool12, bool13, bool14, bool15, f3, str22, adsRequestImpl$AutoPlayState, adsRequestImpl$ContinuousPlayState, adsRequestImpl$MutePlayState, l8fVar5, str23, customUiOptionsData, i);
    }
}
