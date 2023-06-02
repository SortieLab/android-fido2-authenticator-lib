package sortielab.library.fido2.encrypt.tools


object FidoConstants {
    // Other Properties
    const val ATTESTATION_CONNECTION_TYPE: String = "TLS"
    const val USER_AUTHENTICATE_MODE_CREATE = "create"
    const val USER_AUTHENTICATE_MODE_AUTHENTICATE = "authenticate"

    // FIDO Properties
    const val FIDO2_KEYSTORE_PROVIDER = "AndroidKeyStore"
    const val FIDO2_KEY_ECDSA_CURVE = "secp256r1"
    const val FIDO2_SIGNATURE_ALGORITHM = "SHA256withECDSA"
    const val FIDO2_USER_AUTHENTICATION_VALIDITY = 5 // Minutes - For PSD2 RTS

    const val FIDO2_KEY_LABEL_KEY_NAME = "keyname"
    const val FIDO2_KEY_LABEL_ORIGIN = "origin"
    const val FIDO2_KEY_LABEL_ALGORITHM = "algorithm"
    const val FIDO2_KEY_LABEL_SIZE = "size"
    const val FIDO2_KEY_LABEL_USER_AUTH = "userauth"
    const val FIDO2_KEY_LABEL_SE_MODULE = "semodule"
    const val FIDO2_KEY_LABEL_SE_MODULE_TYPE = "semoduleType"
    const val FIDO2_KEY_LABEL_HEX_PUBLIC_KEY = "publickey"

    const val FIDO2_EXTENSION_APPID = "appid"
    const val FIDO2_EXTENSION_TXAUTH_SIMPLE = "txAuthSimple"
    const val FIDO2_EXTENSION_TXAUTH_GENERIC = "txAuthGeneric"
    const val FIDO2_EXTENSION_AUTHENTICATOR_SELECTION = "authnSel"
    const val FIDO2_EXTENSION_SUPPORTED_EXTENSIONS = "exts"
    const val FIDO2_EXTENSION_USER_VERIFICATION_INDEX = "uvi"
    const val FIDO2_EXTENSION_LOCATION = "loc"
    const val FIDO2_EXTENSION_USER_VERIFICATION_METHOD = "uvm"
    const val FIDO2_EXTENSION_BIOMETRIC_PERFBOUNDS = "biometricPerfBounds"

    // FIDO related miscellaneous constants
    const val FIDO_COUNTER_ZERO = 0
    const val FIDO_COUNTER_ONE = 1

    // Android KeyStore Info
    const val ANDROID_KEYSTORE_ASSERTION_LABEL_AUTHENTICATOR_DATA = "authenticatorData"
    const val ANDROID_KEYSTORE_ASSERTION_LABEL_SIGNATURE = "signature"

    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_FIDO = "FidoAndroidKeystoreAttestation"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_FIDO_JSON_FORMAT = "JsonFormat"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_FIDO_CBOR_FORMAT = "CborFormat"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_AUTHENTICATOR_DATA = "authData"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_FORMAT = "fmt"
    const val ANDROID_KEYSTORE_ATTESTATION_VALUE_FORMAT = "android-key"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_STATEMENT = "attStmt"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_ALGORITHM = "alg"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_SIGNATURE = "sig"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_X509_CERTIFICATE_CHAIN = "x5c"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_CREDENTIAL_CERTIFICATE = "credCert"
    const val ANDROID_KEYSTORE_ATTESTATION_LABEL_CA_CERTIFICATE = "caCert"

    /**
     * User is always verified for AndroidKeystore use; thus "uvm" extension is always included
     * https://fidoalliance.org/specs/fido-v2.0-id-20180227/fido-registry-v2.0-id-20180227.html#user-verification-methods
     */
    private const val USER_PRESENT = true
    private const val USER_NOT_PRESENT = false
    private const val USER_VERIFIED = true
    private const val USER_NOT_VERIFIED = false
    private const val ATTESTED_DATA_INCLUDED = true
    private const val ATTESTED_DATA_NOT_INCLUDED = false
    private const val EXTENSION_DATA_INCLUDED = true
    private const val EXTENSION_DATA_NOT_INCLUDED = false

    const val FIDO_USER_VERIFY_PRESENCE = 1
    const val FIDO_USER_VERIFY_FINGERPRINT = 2
    const val FIDO_USER_VERIFY_PASSCODE = 4
    const val FIDO_USER_VERIFY_VOICEPRINT = 8
    const val FIDO_USER_VERIFY_FACEPRINT = 16
    const val FIDO_USER_VERIFY_LOCATION = 32
    const val FIDO_USER_VERIFY_EYEPRINT = 64
    const val FIDO_USER_VERIFY_PATTERN = 128
    const val FIDO_USER_VERIFY_HANDPRINT = 256
    const val FIDO_USER_VERIFY_NONE = 512
    const val FIDO_USER_VERIFY_ALL = 1024

    const val FIDO_KEY_PROTECTION_SOFTWARE = 1
    const val FIDO_KEY_PROTECTION_HARDWARE = 2
    const val FIDO_KEY_PROTECTION_TEE = 4
    const val FIDO_KEY_PROTECTION_SECURE_ELEMENT = 8
    const val FIDO_KEY_PROTECTION_REMOTE_HANDLE = 16

    const val FIDO_MATCHER_PROTECTION_SOFTWARE = 1
    const val FIDO_MATCHER_PROTECTION_TEE = 2
    const val FIDO_MATCHER_PROTECTION_ON_CHIP = 4

    val ANDROID_KEYSTORE_DEFAULT_REGISTRATION_FLAGS = arrayOf(
        USER_NOT_PRESENT,
        USER_VERIFIED,
        ATTESTED_DATA_INCLUDED,
        EXTENSION_DATA_INCLUDED
    )

    val ANDROID_KEYSTORE_DEFAULT_AUTHENTICATION_FLAGS = arrayOf(
        USER_NOT_PRESENT,
        USER_VERIFIED,
        ATTESTED_DATA_NOT_INCLUDED,
        EXTENSION_DATA_INCLUDED
    )

    val ANDROID_KEYSTORE_DEFAULT_AUTHORIZATION_FLAGS = arrayOf(
        USER_PRESENT,
        USER_VERIFIED,
        ATTESTED_DATA_NOT_INCLUDED,
        EXTENSION_DATA_INCLUDED
    )

    // Error keys
    const val ERROR_CERTIFICATE_NOT_FOUND = "ERROR_CERTIFICATE_NOT_FOUND"
    const val ERROR_EMPTY_KEYSTORE = "ERROR_EMPTY_KEYSTORE"
    const val ERROR_EMULATOR = "ERROR_EMULATOR"
    const val ERROR_EXCEPTION = "ERROR_EXCEPTION"
    const val ERROR_INVALID_FUNCTION = "ERROR_INVALID_FUNCTION"
    const val ERROR_INVALID_WEBSERVICE = "ERROR_INVALID_WEBSERVICE"
    const val ERROR_KEY_NOT_FOUND = "ERROR_KEY_NOT_FOUND"
    const val ERROR_NETWORK_UNAVAILABLE = "ERROR_NETWORK_UNAVAILABLE"
    const val ERROR_NOT_IMPLEMENTED_YET = "ERROR_NOT_IMPLEMENTED_YET"
    const val ERROR_NOT_PRIVATE_KEY = "ERROR_NOT_PRIVATE_KEY"
    const val ERROR_NULL_CONTEXT = "ERROR_NULL_CONTEXT"
    const val ERROR_SIGNATURE_OBJECT_NOT_INITIALIZED = "ERROR_SIGNATURE_OBJECT_NOT_INITIALIZED"
    const val ERROR_SINGLE_CERTIFICATE_IN_CHAIN = "ERROR_SINGLE_CERTIFICATE_IN_CHAIN"
    const val ERROR_TLS_CONNECTION = "ERROR_TLS_CONNECTION"
    const val ERROR_UNAUTHENTICATED_USER = "ERROR_UNAUTHENTICATED_USER"

    // Json Key - Value
    const val JSON_KEY_PUBLIC_KEY_ALG_ES256_LABEL = "ES256"
    const val JSON_KEY_PUBLIC_KEY_ALG_ES256 = -7
    const val JSON_KEY_PUBLIC_KEY_ALG_EC_LABEL = "EC"
    const val JSON_KEY_PUBLIC_KEY_ALG_RS256_LABEL = "RS256"
    const val JSON_KEY_PUBLIC_KEY_ALG_RS256 = -257
    const val JSON_KEY_PUBLIC_KEY_ALG_RSA_LABEL = "RSA"
    const val JSON_KEY_PUBLIC_KEY_TYPE = "public-key"


    // WEBAUTHN JSON Keys
    const val WEBAUTHN_CLIENT_DATA_OPERATION_TYPE_KEY = "type"
    const val WEBAUTHN_CLIENT_DATA_OPERATION_CREATE_VALUE = "webauthn.create"
    const val WEBAUTHN_CLIENT_DATA_OPERATION_GET_VALUE = "webauthn.get"
    const val WEBAUTHN_CLIENT_DATA_CHALLENGE_KEY = "challenge"
    const val WEBAUTHN_CLIENT_DATA_ORIGIN_KEY = "origin"
    const val WEBAUTHN_CLIENT_DATA_TOKEN_BINDING_KEY = "tokenBinding"
    const val WEBAUTHN_CLIENT_DATA_TOKEN_BINDING_STATUS_KEY = "status"
    const val WEBAUTHN_CLIENT_DATA_TOKEN_BINDING_STATUS_PRESENT = "present"
    const val WEBAUTHN_CLIENT_DATA_TOKEN_BINDING_STATUS_SUPPORTED = "supported"
    const val WEBAUTHN_CLIENT_DATA_TOKEN_BINDING_STATUS_NOT_SUPPORTED = "not-supported"

    // Sortielab AAGUID SORTIELAB FIDO2 23
    // CAFEBABECAFEBEEF0123456789ABCDEF
    // 534F525449454C41424649444F323233
    const val WEBAUTHN_SORTIELAB_ANDROID_FIDO2_AAGUID = "534F525449454C41424649444F323233"
}